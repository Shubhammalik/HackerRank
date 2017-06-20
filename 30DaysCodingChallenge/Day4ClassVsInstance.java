package com.hr.thirtydays;

import java.util.Scanner;

public class Day4ClassVsInstance {
	private	int age;
	
	
	public Day4ClassVsInstance(int age)
	{
		if(age<0)
		{
			this.age=0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		else
		this.age= age;
	}
	
	public void yearPasses()
	{
		this.age+=1;
	
	}
	
	public void amIOld()
	{
		if(age<13)
			System.out.println("You are young.");
		else if ( (age>=13) && (age<18) )
			System.out.println("You are a teenager.");
		else
			System.out.println("You are old.");
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4ClassVsInstance p = new Day4ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
	
	}

}
