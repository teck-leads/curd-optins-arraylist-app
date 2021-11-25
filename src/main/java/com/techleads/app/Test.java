package com.techleads.app;

import java.util.StringJoiner;

public class Test {

	public static void main(String[] args) {
		// input =5
		// output 1 1 2 3 5
		// input 8
		// 1 1 2 3 5 8 13 21
		int limit = 5;
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2 + " ");
		
		
		for (int i = 2; i <= limit; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
		}

	}

}
