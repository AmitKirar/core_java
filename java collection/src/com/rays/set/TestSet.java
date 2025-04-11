package com.rays.set;

import java.util.HashSet;
import java.util.Set;

//1. set does not contain duplicate values
//2. set contain only one null values
//3. order of set is sorting order by default acs
public class TestSet {
	
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add('b');
		set.add('a');
		set.add('b');
		set.add(null);
		set.add(null);
		
		System.out.println("set :"+set);
		System.out.println("size of set :"+set.size());

	}

}
