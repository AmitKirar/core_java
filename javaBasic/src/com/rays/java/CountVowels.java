package com.rays.java;

public class CountVowels {

	public static void main(String[] args) {
		String str = "google";
		int count = 0;

		System.out.println("String Length " + str.length());

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.print(ch);
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
