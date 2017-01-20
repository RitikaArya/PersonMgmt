package com.incture;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.incture.beans.Test2BeanLocal;

/**
 * Session Bean implementation class TestBean
 */
@Stateless
public class TestBean implements TestBeanLocal {

	@EJB
	private Test2BeanLocal local;

	@Override
	public List<String> getValues() {
		return local.getValues();
	}

}
