package com.hr.thirtydays;

import java.util.Scanner;

public class Day1DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int i1 = scan.nextInt();
		double d1 = scan.nextDouble();
		String ss = scan.nextLine();
		String s1 = scan.nextLine();

		System.out.println(i + i1);
		System.out.printf("%.1f", d + d1);
		System.out.println();
		//System.out.println(d+d1);
		System.out.println(s + s1);
		scan.close();
	}
}