package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee e = new Employee("lucky", 3);
		FileOutputStream file = new FileOutputStream("D:\\komal\\Employee.txt");
		FileInputStream file1 = new FileInputStream("D:\\\\komal\\\\Employee.txt");

		// serialization
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(e);
		out.close();
		System.out.println("serialize successfully");

		// deserialization
		ObjectInputStream in = new ObjectInputStream(file1);
		e = (Employee) in.readObject();
		System.out.println(e);
		in.close();
		System.out.println("deserializtion successfully");

	}

}
