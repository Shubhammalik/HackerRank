package com.hr.thirtydays;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	 private static int[] testScores;
         public Student(String firstName, String lastName, int id,int [] testScores){
             super(firstName,lastName,id);
             this.testScores = testScores;
         }
    
 public char calculate()
     { int[] testScore=Student.testScores;
     int n = testScore.length;
           int sum = 0;
             for(int i=0;i<n;i++){
                 sum+= testScore[i];
             }
     double a = sum/n;
     
     if((a>=90)&&(a<=100))
        return 'O';
      else if((a>=80)&&(a<90))
        return 'E';
       else if((a>=70)&&(a<80))
         return 'A';
        else if((a>=55)&&(a<70))
          return 'P';
         else if((a>=40)&&(a<55))
           return 'D';
          else
            return 'T';
 }

}


public class Day12Inheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
	
}
/*sample input 
Heraldo Memelli 8135627
2
100 80
*/