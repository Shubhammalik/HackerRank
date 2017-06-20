package com.hr.thirtydays;

import java.util.Scanner;


class Calculator{
    int n,p;
public   Calculator(){}
   public int power(int n,int p){
      int result=n;
       if(n<0||p<0)
           throw new IllegalArgumentException("n and p should be non-negative");
       else if(p==0)
           return 1;
          else
          {
           int temp =n;
           p--;// for number power 1
           while(p>0)
           {
               
           result =temp*n;
           temp=result;
               p--;
       }
       }
       return result;
   } 
}

public class Day17Exceptions {
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
