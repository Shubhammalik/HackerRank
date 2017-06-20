package com.hr.thirtydays;

import java.util.LinkedList;
import java.util.Scanner;


public class Day18StackQueues {
    LinkedList queue = new LinkedList();
    LinkedList stack = new LinkedList();
    

    void pushCharacter(char ch) {
        stack.add(ch);
        System.out.println("stack push : "+ch);
    }
    char popCharacter() {
    	char ch = (char) stack.remove(stack.size()-1);
    	System.out.println("stack pop : "+ch);
    	return ch;
    }
    void enqueueCharacter(char ch) {
         queue.addLast(ch);
         System.out.println("queue enqued : "+ch);
    }
    
    char dequeueCharacter() {
    	char ch = (char) queue.remove(0);
    	System.out.println("queue dequed : "+ch);
    	return ch;
    }

public static void main(String[] args) {
   
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Day18StackQueues p = new Day18StackQueues();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
        p.pushCharacter(c);
        p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length/2; i++) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            isPalindrome = false;                
            break;
        }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.println( "The word, " + input + ", is " 
                       + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
}
}