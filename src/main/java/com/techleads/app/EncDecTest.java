package com.techleads.app;

public class EncDecTest {

	public static void main(String[] args) {
		String text = "my atm pin is 1234";
		int key = 6;
		System.out.println(text);
		System.out.println("=====");
		String encrypt = encrypt(text, key);
		System.out.println(encrypt);
		System.out.println("decrypt");
		String decrypt = decrypt(encrypt, key);
		System.out.println(decrypt);
		

	}

	public static String encrypt(String text, int key) {
		char[] ch = text.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : ch) {
//			c += key;
			c = (char) (c+key);
			sb.append(c);
		}

		return sb.toString();
	}
	
	public static String decrypt(String text, int key) {
		char[] ch = text.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : ch) {
//			c -= key;
			c = (char) (c-key);
			sb.append(c);
		}

		return sb.toString();
	}

}
