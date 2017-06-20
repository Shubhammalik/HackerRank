
package com.hr.practice;

import java.util.Scanner;

public class ArrayLeftRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int leftrotate = sc.nextInt();
		int arr[] = new int[len];

		for (int i = 0; i < len; i++)
			arr[i] = sc.nextInt();

		ArrayLeftRotation alr = new ArrayLeftRotation();
		int count = 0;
		// arr = alr.rotateLeft1(arr, len, leftrotate);
		// arr = alr.rotateLeft2(arr, len, leftrotate, count);
		alr.rotateLeft3(arr, len, leftrotate);
		alr.printArray(arr, len);

	}

	private int[] rotateLeft1(int arr[], int len, int leftrotate) {
		// first approach 2 for loops failed due to timeout when input: 90498
		// 25231
		for (int i = 0; i < leftrotate; i++) {
			int newarr[] = new int[len];
			for (int j = 0; j < len; j++) {
				if (j == 0)
					newarr[len - 1] = arr[j];
				else
					newarr[j - 1] = arr[j];
			}
			arr = newarr;
		}
		return arr;
	}

	private int[] rotateLeft2(int arr[], int len, int leftrotate, int count) {
		// second approach with recursion failed due to timeout when input:
		// 90498 25231
		int newarr[] = new int[len];
		newarr[len - 1] = arr[0];
		int j = 1;
		while (j < len) {
			newarr[j - 1] = arr[j];
			j++;
		}

		count++;
		arr = newarr;

		if (count != leftrotate)
			arr = rotateLeft2(arr, len, leftrotate, count);

		return arr;
	}

	private void rotateLeft3(int arr[], int len, int leftrotate) {
		// passed, reduced loops complexity and no recursion
		for (int i = 0; i < leftrotate; i++)
			leftrotate(arr, len);
	}

	private void leftrotate(int[] arr, int len) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < len - 1; i++)
			arr[i] = arr[i + 1];
		arr[len - 1] = temp;
	}

	private void printArray(int[] arr, int len) {
		for (int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
	}

}
