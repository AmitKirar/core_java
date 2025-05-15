package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileBufferedWriter {

	public static void main(String[] args) throws IOException {
		FileWriter  file = new FileWriter("D:\\komal\\hello.txt");
		BufferedWriter bw= new BufferedWriter(file);
		bw.write("Hello Divyanshu");
		System.out.println("successfully");
		bw.close();

	}

}
