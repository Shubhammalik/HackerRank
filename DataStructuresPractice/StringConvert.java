package com.hr.practice;

import java.util.Scanner;

public class StringConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] arr = s.toCharArray();

		arr = convertCase(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	private static char[] convertCase(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int j = (int) arr[i];
			if (j > 64 && j < 91) {
				arr[i] = Character.toLowerCase(arr[i]);
			} else if (j > 96 && j < 123) {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		return arr;
	}

}
