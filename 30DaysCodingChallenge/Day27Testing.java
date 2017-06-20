package com.hr.thirtydays;

import java.util.Scanner;

public class Day27Testing {
int n ;
int k;
int [] arr;

public Day27Testing(int n, int k, int[] arr) {
	super();
	this.n = n;
	this.k = k;
	this.arr = arr;
}


	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++){
			int n = sc.nextInt();
			int k=sc.nextInt();
			int [] arr= new int[n];
			for(int j=0;j<n;j++){
				arr[j]=sc.nextInt();
			}
			
		}
	}
}
