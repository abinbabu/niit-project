package com.niit.shoppingcart.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;


public class TestCategoryDAO {
	
	
	@Autowired
	CategoryDAO categoryDAO;

	

	AnnotationConfigApplicationContext context;

	@Before
	public void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test

	public void UserTestCase() {
		int size = categoryDAO.list().size();
		assertEquals("supplier list test case ", 1, size);

	}


}
