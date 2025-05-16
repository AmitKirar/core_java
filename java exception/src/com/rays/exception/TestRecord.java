package com.rays.exception;

public class TestRecord {

	public static void main(String[] args) throws DuplicateRecordException {
		String str = "raman";
		String str1= "raman";
		if (str.equals(str1)) {
			throw new DuplicateRecordException("DuplicateRecordException");
		}else {
			System.out.println("It's not a duplicate");
			
		}

	}

}
