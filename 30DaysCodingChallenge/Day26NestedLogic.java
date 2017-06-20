package com.hr.thirtydays;

import java.util.*;

public class Day26NestedLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int j = 0;
		int[] act = new int[n];
		int[] exp = new int[n];
		int[] input = new int[6];
		for (int i = 0; i < 6; i++) {
			input[i] = sc.nextInt();
		}

		for (int i = 0; i < 6; i++) {
			if (i < 3) {
				act[i] = input[i];
			} else {
				exp[j] = input[i];
				j++;
			}
		}
		System.out.println(calculateFine(act, exp));

	}

	private static int calculateFine(int[] act, int[] exp) {
		int fine = 0;
		if (act[1] == exp[1] && act[2] == exp[2]) {
			int days = 0;
			days = act[0] - exp[0];
			if (days > 0) {
				// book returned after due date in same month
				fine = 15 * days;
			}
			// else will return 0, for book returned before date
			return fine;
		}

		else if (act[1] != exp[1] && act[2] == exp[2]) {
			int month = 0;
			month = act[1] - exp[1];
			if (month > 0) {
				// if book is returned month(s) late in same year
				fine = 500 * month;
			}
			return fine;
		}

		else {
			int year = 0;
			year = act[2] - exp[2];
			if (year > 0) {
				fine = 10000;
			}
			return fine;
		}

	}
}