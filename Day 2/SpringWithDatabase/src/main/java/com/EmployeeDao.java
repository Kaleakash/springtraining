package com;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	// Normal JDBC with DataSource Features 
	/*
	@Autowired
	DataSource ds;
	
	public int storeEmployee(Employee emp) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return 0;
	}*/
	
	
	// Spring JDBC with DataSource Features
	
	/*
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeEmployee(Employee emp) {
		try {
			return jdbcTemplate.update("insert into employee values(?,?,?)", emp.getId(),emp.getName(),emp.getSalary());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return 0;
	}
	
	*/
	
	// Spring ORM with Hibernate and DataSource Features 
	
	/*
	@Autowired
	SessionFactory sf;
	
	public int storeEmployee(Employee emp) {
		try {
					Session session = sf.openSession();
					Transaction tran = session.getTransaction();
					tran.begin();
							session.save(emp);
					tran.commit();
					
					Employee emp1 = (Employee)session.get(Employee.class, new Integer(emp.getId()));
					if(emp1!=null) {
						return 1;
					}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return 0;
	}
	
	*/
	
	
	// Spring ORM with JPA and DataSource Features 
	
	@Autowired
	EntityManagerFactory emf;
	
	public int storeEmployee(Employee emp) {
		try {
					EntityManager manager = emf.createEntityManager();
					EntityTransaction tran = manager.getTransaction();
					
					tran.begin();
							manager.persist(emp);
					tran.commit();
					
					Employee emp1 = (Employee)manager.find(Employee.class, new Integer(emp.getId()));
					if(emp1!=null) {
						return 1;
					}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return 0;
	}
}
