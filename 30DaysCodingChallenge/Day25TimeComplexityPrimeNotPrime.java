package com.hr.thirtydays;


import java.util.Scanner;


public class Day25TimeComplexityPrimeNotPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Day25TimeComplexityPrimeNotPrime s = new Day25TimeComplexityPrimeNotPrime();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++){
            s.findPrime(a[i]);
        }
    }
   public void findPrime(int a) {
		double n1 = Math.sqrt(a);
		int n2 = 1 + (int) n1;
		int i = 0;
	
		for (i = 2; i <=n2; i++) {
			if ((a % i == 0)&&(a!=2)) {
				System.out.println("Not prime");
				break;
			}
		}
		i++;
		if ((i >= n2) && (a % (i-1) != 0)) {
			if(a==1){
				System.out.println("Not prime");
			}
			else
			System.out.println("Prime");
		}

	}
}