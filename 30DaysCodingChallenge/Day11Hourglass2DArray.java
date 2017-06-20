package com.hr.thirtydays;

import java.util.Scanner;

public class Day11Hourglass2DArray {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        int max_sum = sumOfHourglass(arr);
            System.out.println(max_sum);
	    }
	    
	    private static int sumOfHourglass(int [][] arr){
	        int max_sum= Integer.MIN_VALUE;
	        int sum = 0;
	        for(int i=0;i<4;i++){
	            for(int j=0;j<4;j++){
	                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
	                		arr[i+2][j] + + arr[i+2][j+1] + arr[i+2][j+2];
	            
	            max_sum= findMax(max_sum,sum);
	            }
	        }
	      
	        return max_sum;
	    }
	    
	    public static int findMax(int a, int b) {
	        return (a >= b) ? a : b;
	    }
}
