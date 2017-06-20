package com.hr.thirtydays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Day10BinaryConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		getBinaryBits(n);

	}

	private static void getBinaryBits(int n) {
		ArrayList<Integer> al = new ArrayList<>();
		int m = n;
		int result = 0;
		while (m != 0) {
			result = m % 2; // Taking remainder and adding it to list
							// reverse of list will give binary representation
							// of input n
			m = m / 2;
			al.add(result);
		}
		int size = al.size();
		int[] arr = new int[size];
		Iterator itr = al.iterator();
		int i = size - 1;
		while (itr.hasNext()) {
			arr[i] = (int) itr.next();// reversing list to get binary rep of n
										// in arr
			i--;
		}
		findConsequtiveOne(arr); // calling function to find consequtive one's

	}

	private static void findConsequtiveOne(int[] arr) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				count++;
			else
				count = 0;

			if (count > maxCount)
				maxCount = count;
		}
		System.out.println(maxCount); // printing number of max consecutive 1's
	}
}
