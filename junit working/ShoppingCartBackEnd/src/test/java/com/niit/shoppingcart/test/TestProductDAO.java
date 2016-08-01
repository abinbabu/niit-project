package com.niit.shoppingcart.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;

public class TestProductDAO {

	
	@Autowired
	ProductDAO productDAO;

	

	AnnotationConfigApplicationContext context;

	@Before
	public void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}

	@Test

	public void UserTestCase() {
		int size = productDAO.list().size();
		assertEquals("product list test case ", 1, size);

	}

}
