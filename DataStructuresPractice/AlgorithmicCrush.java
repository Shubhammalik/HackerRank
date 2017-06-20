package com.hr.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // Size of array
		long[] arr = new long[n];
		int m = scan.nextInt(); // number of operations
		long[] input = new long[3 * m];
		for (int i = 0; i < 3 * m; i++) {// index 0-2 contains first indexes and
											// operation
			input[i] = scan.nextLong();
		}
		AlgorithmicCrush ac = new AlgorithmicCrush();
		arr = ac.addToArray(arr, n, input, m);
		long max = ac.findMax(arr);
		System.out.println(max);
	}

	private long findMax(long[] arr) {
		long max = -1;
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("adding to list :" + arr[i]);
			list.add(arr[i]);
		}
		max = Collections.max(list);
		return max;
	}

	private long[] addToArray(long[] arr, int n, long[] input, int m) {
		for (int i = 2; i < 3 * m; i += 3) {
			long a = input[i - 2];
			long b = input[i - 1];
			long k = input[i];
			System.out.println("a : " + a + " ,b : " + b + " ,k : " + k);

			arr = incrementArray(a - 1, b - 1, k, arr);
		}
		return arr;
	}

	private long[] incrementArray(long a, long b, long k, long[] arr) {
		for (long i = a; i <= b; i++) {
			arr[(int) i] += k;
			
		}
		
		System.out.println("inc array");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		return arr;
	}
}
