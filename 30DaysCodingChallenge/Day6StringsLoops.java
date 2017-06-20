package com.hr.thirtydays;

import java.util.Scanner;

public class Day6StringsLoops {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String[] arr = new String[t];
		scan.nextLine();
		int[] arrlen = new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = scan.nextLine();
			arrlen[i] = arr[i].length();
		}
		Day6StringsLoops ds = new Day6StringsLoops();
		for (int i = 0; i < t; i++) {
			ds.printSeq(arr[i], arrlen[i]);
		}

	}

	private void printSeq(String arr, int n) {

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				System.out.print(arr.charAt(i));
		}
		System.out.print(" ");
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0)
				System.out.print(arr.charAt(i));
		}
		System.out.println("");

	}
}
