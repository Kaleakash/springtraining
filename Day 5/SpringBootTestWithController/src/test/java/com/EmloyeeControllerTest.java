package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import com.jayway.jsonpath.JsonPath;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.BDDMockito.given;
@RunWith(SpringRunner.class)
@WebMvcTest(value=EmployeeController.class)
public class EmloyeeControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	EmployeeController employeeController;
	
	@Test
	public void testEmployeeConroller() {
		try {
		//Testing for simple text msg 
			
		MvcResult result	= mvc.perform(get("/welcome").contentType(MediaType.TEXT_PLAIN_VALUE)).andExpect(status().isOk()).andReturn();
		String content = result.getResponse().getContentAsString();
		assertEquals("Welcome to Spring boot Controller", content);
		
		MockHttpServletResponse response =  result.getResponse();
		 System.out.println(" Content Length "+response.getContentLength());
		 System.out.println(" Content type "+response.getContentType());
		 System.out.println(" Status "+response.getStatus());
		 System.out.println(" Redirected URL "+response.getRedirectedUrl());
		 }catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	@Test 
	public void empJsonTest() {
		 //Testing for Complex Employee object in the form of JSON 
		String empJson ="{'id':100,'name':'Raj','salary':12000}";
		try {
		mvc.perform(get("/getEmp").contentType(MediaType.APPLICATION_JSON_VALUE)).
		andExpect(status().isOk()).andExpect(content().json(empJson));
		}catch(Exception e) {
			System.out.println("Error "+e);
		}
	}
}
