package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\komal\\hello.txt");
		char[] charArray = { 'h', 'i' };
		fw.write(charArray);
		fw.write(',');
		fw.write("amit");

		System.out.println("successfully");
		fw.close();

	}
}