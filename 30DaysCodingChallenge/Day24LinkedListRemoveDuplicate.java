package com.hr.thirtydays;

import java.io.*;
import java.util.*;

class NodeLL {
	int data;
	NodeLL next;

	NodeLL(int d) {
		data = d;
		next = null;
	}

}

public class Day24LinkedListRemoveDuplicate {
	public static NodeLL removeDuplicates(NodeLL head) {
		// Write your code here
		   NodeLL current = head;
	        while(current.next!=null){
	            if(current.data==current.next.data){
	                current.next = current.next.next;
	            }
	            else{
	            current = current.next;
	            }
	        }
	return head;

	}

	public static NodeLL insert(NodeLL head, int data) {
		NodeLL p = new NodeLL(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			NodeLL start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(NodeLL head) {
		NodeLL start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NodeLL head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}
