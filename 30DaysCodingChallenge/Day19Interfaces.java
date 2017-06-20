package com.hr.thirtydays;

import java.util.Scanner;

interface AdvancedArithmetic{
	   int divisorSum(int n);
	}

class Calculator12 implements AdvancedArithmetic{
    
    public Calculator12(){
        super();
    }
    
    public int divisorSum(int n)
        {
        int sum=0;
        int[] arr= new int[n+1];
        int count=0;
         for(int i=1;i<=n;i++)
             {
             if(n%i==0){
            	 System.out.println("n : "+n+" divisor : "+i);
                 arr[i]=i;
                 count++;
             }
             else
                 {arr[i]=0;
                
                 }
         }
             for(int i=0;i<=n;i++){
                 sum+=arr[i];
                 }
         System.out.println("total divisors : "+count);
        return sum;
    }
}
 class Day19Interfaces {



    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator12(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println("sumn = "+sum+",of divisor of "+n);
    }
}
