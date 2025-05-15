package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("D:\\komal\\hello.txt");

		int i = in.read();

		while (i != -1) {
			System.out.println(i + "");
//			System.out.print((char) i + "");
			i = in.read();
		}
		in.close();
	}

}
