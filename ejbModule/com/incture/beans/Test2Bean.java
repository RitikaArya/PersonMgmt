package com.incture.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Test2Bean
 */
@Stateless
public class Test2Bean implements Test2BeanLocal {

	@Override
	public List<String> getValues() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Yup!!!");
		arrayList.add("EJB is accessible from the Web APP!!!");
		return arrayList;

	}

}
