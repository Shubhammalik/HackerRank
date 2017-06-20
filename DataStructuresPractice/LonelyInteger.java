package com.hr.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
	private static int lonelyInteger(int[] a) {
		int n = a.length;
		String[] b = new String[n];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					b[i] = b[j] = String.valueOf(a[i]);
					break;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (b[i] != null) {
			} else {
				return a[i];
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		
		double n1 = Math.log(12) / Math.log(2) ;
        int n2 =(int)n1;
		//System.out.println(n2);
		System.out.println(lonelyInteger(a));
	}

}
