package com.hr.thirtydays;

import java.util.Scanner;

public class Day20BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int num = 0;
		Day20BubbleSort s = new Day20BubbleSort();
		arr = s.returnSorted(arr, n, num);
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[n - 1]);
	}

	private int[] returnSorted(int[] arr, int n, int num) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					num++;
				}
			}

			if (num == 0) {
				break;
			}
		}

		System.out.println("Array is sorted in " + num + " swaps.");

		return arr;
	}

}
