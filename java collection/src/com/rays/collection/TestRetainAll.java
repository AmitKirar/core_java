package com.rays.collection;


import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll  {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		c1.add("KGF");
		c1.add(56);
		c1.add(6.6);
		c1.add(true);
		c1.add('a');
		c1.add("PUSHPA");
		System.out.println("c1:"+c1);
		System.out.println("size of c1:"+c1.size());
		System.out.println("---------");
		
		Collection c2 = new ArrayList();

		c2.add("KALKI");
		c2.add(2898);
		c2.add('v');
		c2.add(6.6);
		c2.add("PUSHPA");
		c2.add(true);
		System.out.println("c2:"+c2);
		
		c1.retainAll(c2);
		System.out.println(c1);

	}

}
