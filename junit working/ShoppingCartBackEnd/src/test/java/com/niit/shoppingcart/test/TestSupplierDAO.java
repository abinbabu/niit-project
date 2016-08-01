package com.niit.shoppingcart.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;

public class TestSupplierDAO {

	@Autowired
	SupplierDAO supplierDAO;

	

	AnnotationConfigApplicationContext context;

	@Before
	public void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}

	@Test

	public void UserTestCase() {
		int size = supplierDAO.list().size();
		assertEquals("supplier list test case ", 1, size);

	}

}
