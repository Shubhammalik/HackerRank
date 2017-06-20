package com.hr.practice;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
		String[] narr = new String[n];
		System.out.println("enter n Strings");
		scan.nextLine();
		for (int i = 0; i <n; i++) {
			narr[i] = scan.nextLine(); // or br.readLine(); to read complete line with spaces
		}
		System.out.println("enter q");
		int q = scan.nextInt();
		System.out.println("enter q Strings");
		String[] qarr = new String[q];
		scan.nextLine();
		for (int i = 0; i <q; i++) {
			qarr[i] = scan.nextLine(); // or br.readLine();
		}

		int[] qarrCount = new int[q];
		SparseArrays s = new SparseArrays();
		qarrCount = s.match(narr, n, qarr, q);

		for (int i = 0; i < q; i++) {
			System.out.println(qarrCount[i]);
		}
	}

	private int[] match(String[] narr, int n, String[] qarr, int q) {
		int[] qarrCount = new int[q];
		for (int i = 0; i < q; i++) {
			qarrCount[i] = matchString(narr, n, qarr[i]);
		}

		return qarrCount;

	}

	private int matchString(String[] narr, int n, String qarr) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (narr[i].equals(qarr))  // or // if((narr[i].contains(qarr))&&(narr[i].length()==qarr.length()))
				count++;
		}
		System.out.println("count for " + qarr + " is : " + count);
		return count;
	}

}
