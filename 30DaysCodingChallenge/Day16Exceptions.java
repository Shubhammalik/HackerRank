package com.hr.thirtydays;

import java.util.Scanner;

//tried making custom exception
class InvalidStringException extends NumberFormatException{
	private static final long serialVersionUID = 1L;
	public InvalidStringException(String s){
	super(s);
	}
}

public class Day16Exceptions {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
    
       try{
       int  i = Integer.parseInt(S);
       System.out.println(i);
       }
       catch(NumberFormatException e){
    	   System.out.println("Bad String");
       }
 
	}
}
