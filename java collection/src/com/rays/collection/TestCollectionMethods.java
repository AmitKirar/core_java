package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("KGF");
		c1.add(56);
		c1.add(5.6);
		c1.add(true);
		c1.add('a');
		c1.add("KGF");

		System.out.println("c1:" + c1);
		System.out.println("size of c1:" + c1.size());
		System.out.println("-----------");

		Collection c2 = new ArrayList();
		c2.add("KALKI");
		c2.add(2898);
		c2.add('b');
		c2.add(2.2);
		c2.add(false);

		System.out.println("c2:" + c2);
		System.out.println("size of c2 :" + c2.size());
		System.out.println("---------");

		System.out.println("is c1 contains c2:" + c1.containsAll(c2));
		c1.addAll(c2);
		System.out.println("c1:" + c1);
		System.out.println("size of c1:" + c1.size());

		System.out.println("----------");
		System.out.println("is KALKI in c1:" + c1.contains("KALKI"));
		System.out.println("is c1 contains c2:" + c1.containsAll(c2));

		System.out.println("----------");
		c1.remove("KGF");
		System.out.println("c1 after remove KGF:" + c1);
		c1.removeAll(c2);
		System.out.println("c1 after remove c2:" + c1);
		System.out.println("is c1 is empty:" + c1.isEmpty());
		c1.clear();
		System.out.println("c1 after clear:" + c1);
		System.out.println("c2:" + c2);
		c2.clear();
		System.out.println("c2 after clear:"+c2);
		System.out.println("c1:"+c1.isEmpty());
	}

}
