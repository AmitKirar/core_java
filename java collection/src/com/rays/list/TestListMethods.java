package com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class TestListMethods {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(0, "ram");
		list.add(1, 56);
		list.add(2, 5.6);
		list.add(3, null);
		list.add(4, null);
		list.add(5, "ram");
		
		System.out.println("list :"+list);
		System.out.println("3rd value of list:"+list.get(2));
		
		list.remove(2);
		System.out.println("list :"+list);
		System.out.println(list.indexOf("ram"));
		System.out.println(list.lastIndexOf("ram"));
		System.out.println(list.subList(0, 4));


	}

}
