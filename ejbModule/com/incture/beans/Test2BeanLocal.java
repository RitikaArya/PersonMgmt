package com.incture.beans;

import java.util.List;

import javax.ejb.Local;

@Local
public interface Test2BeanLocal {

	public List<String> getValues();

}
