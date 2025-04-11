package com.rays.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
//1.list can contain multiple null values
//2.list can contain multiple duplicate values
//3.order of list is natural order

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(0, "ram");
		list.add(1, 56);
		list.add(2, null);
		list.add(3, null);
		list.add(4, "ram");

		System.out.println("list:" + list);
		System.out.println("size of list:" + list.size());

	}

}
