package com.hr.thirtydays;

import java.util.*;

public class Day2Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); //user input : original meal price
        int tipPercent = scan.nextInt(); // user input : tip percentage
        int taxPercent = scan.nextInt(); // user input : tax percentage
        scan.close();
       
        //FIRST Solution
        double tip = (mealCost*tipPercent/100);
        double tax = (mealCost*taxPercent/100);
        double totalCostInDouble= mealCost + tip + tax;
        int totalCost = (int) Math.round(totalCostInDouble);
      
       System.out.println("The total meal cost is "+totalCost+" dollars.");
       
     //SECOND Solution, without any variable used
       System.out.println("The total meal cost is "+(int) Math.round((mealCost + (mealCost*tipPercent/100) + (mealCost*taxPercent/100)))+" dollars.");
    }
}