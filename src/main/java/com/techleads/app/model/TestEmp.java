package com.techleads.app.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestEmp {

	public static void main(String[] args) {

		double widh = 45.45;

		for (int i = 0; i < 5; i++) {
			System.out.println((i * 2) + " " + i);
		}

		System.exit(0);
		// yyyy, MM, dd, hh, min
		String date = customDate(2018, 12, 31);
		System.out.println(date);

//		Employee e1 = new Employee(101, "madhav", "Hyd", "Java", customDate(2017, 02, 24));
//		System.out.println(e1);

	}

	
	public void productOfTwoNums(int x, int y) {
		System.out.println("Product of two numbers "+(x*y));

	}
	private static String customDate(int year, int month, int dayNum) {
//		LocalDateTime ldt = LocalDateTime.of(2018, 12, 31, 12, 10);
		LocalDateTime ldt = LocalDateTime.of(year, month, dayNum, 0, 0);
		String date = DateTimeFormatter.ofPattern("dd-MMM-yyyy").format(ldt);
		return date;
	}

}
