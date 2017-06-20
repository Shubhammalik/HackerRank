package com.hr.thirtydays;

import java.util.*;

public class Day3ConditionalStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";
		if (n % 2 != 0)
			ans = "Weird";
		else if (((n >= 2) && (n <= 5)) && (n % 2 == 0))
			ans = "Not Weird";
		else if (((n > 5) && (n <= 20)) && (n % 2 == 0))
			ans = "Weird";
		else if ((n > 20) && (n % 2 == 0))
			ans = "Not Weird";

		System.out.println(ans);
	}
}