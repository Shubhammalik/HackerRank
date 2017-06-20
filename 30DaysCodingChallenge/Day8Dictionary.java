package com.hr.thirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8Dictionary {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        Map<String,Integer> phonebook = new HashMap<String,Integer>();
	        
	        int n1=3;
	        String[] arr ={ "sam","qwe","asd","poi","zxc","mnb"};
	        int [] num = {1,2,3};
	        
	        for(int i = 0; i < n1; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            phonebook.put(name,phone);
	           
	        }
	
	        
	        while(in.hasNext()){
	            String s = in.next();
	            
	            if(phonebook.get(s)==null){
	            	System.out.println("Not found");
	            }
	            else 
	            	System.out.println(s+"="+phonebook.get(s));
	            
	            
	        }
	        in.close();
	        
	        
	    }
	 
}
