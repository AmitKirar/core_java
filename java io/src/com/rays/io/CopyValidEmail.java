package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyValidEmail {

	public static void main(String[] args) throws IOException {

		FileReader source = new FileReader("D:\\komal\\Email.txt");
		FileWriter target = new FileWriter("D:\\komal\\ValidEmail.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);

		String email;
		while ((email = br.readLine()) != null) {
			if (email.endsWith("@gmail.com")) {

				System.out.println(email);
				bw.write(email);
				bw.newLine();
				// br.readLine();

			}
		}
		br.close();
		bw.close();

	}

}
