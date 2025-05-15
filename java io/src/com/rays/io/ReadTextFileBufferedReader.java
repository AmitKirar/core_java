package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileBufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:\\komal\\hello.txt");
		BufferedReader in = new BufferedReader(file);
		String data = in.readLine();

		while (data != null) {
			System.out.println(data);
			data = in.readLine();
		}
		in.close();

	}

}
