package com.hr.practice;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;

public class StringArraySorting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextLine();
		}
			long start= Calendar.getInstance().getTimeInMillis();
		Arrays.sort(input, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {

				return StringIntegerCompare(a, b);
			}

		});
		long end= Calendar.getInstance().getTimeInMillis();
		System.out.println("time : " +(end-start));
		
		for (String i : input) {
			System.out.println(i);
		}
	}

	static int StringIntegerCompare(String a, String b) {

		if (a.length() > b.length())
			return 1;
		if (a.length() < b.length())
			return -1;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) > b.charAt(i))
				return 1;
			if (a.charAt(i) < b.charAt(i))
				return -1;
		}
		return 0;
	}

}
