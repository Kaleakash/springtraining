package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
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
public class EmloyeeControllerWithServiceTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	EmployeeController employeeController;
	
	@MockBean
	private EmployeeService employeeService;
	
	@Test 
	public void empJsonTestWithServiceLayer() {
		 //Testing for Complex Employee object in the form of JSON 
		Employee emp= new Employee();
		emp.setId(200);
		emp.setName("Seeta");
		emp.setSalary(14000);
		
		given(employeeService.getEmployee()).willReturn(emp);	//I am expecting proxy object not actual data. 
		
		String empJson ="{'id':200,'name':'Seeta','salary':14000}";
		try {
		mvc.perform(get("/getEmp").contentType(MediaType.APPLICATION_JSON_VALUE)).
		andExpect(status().isOk()).andExpect(content().json(empJson));
		}catch(Exception e) {
			System.out.println("Error "+e);
		}
	}
}
