package com.rays.io.externalizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Student e = new Student("ram", 1);
		
		FileOutputStream file = new FileOutputStream("D:\\komal\\Student.txt");
		FileInputStream file1 = new FileInputStream("D:\\\\komal\\\\Student.txt");

		// serialization
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(e);
		out.close();
		System.out.println("serialize successfully");

//	deserialization
		ObjectInputStream in = new ObjectInputStream(file1);
		e = (Student) in.readObject();
		System.out.println(e);
		in.close();
		System.out.println("deserialise successfully");
	}
}
