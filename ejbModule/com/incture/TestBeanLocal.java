package com.incture;

import java.util.List;

import javax.ejb.Local;

@Local
public interface TestBeanLocal {

	public List<String> getValues();

}
