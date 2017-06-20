package com.hr.practice;

import java.util.LinkedList;

public class Test {
int a;


	public Test() {
	
}


	public static void main(String[] args) {
		NodeLinkedList head1 = new NodeLinkedList(9);
		LinkedListCustom list1 = new LinkedListCustom(head1);
		
		list1.addNode(9);
		list1.addNode(9);
		list1.addNode(9);
		list1.addNode(1);
		list1.addNode(1);
		list1.addNode(1);
		list1.addNode(1);
		list1.addNode(2);
		list1.addNode(2);
		list1.addNode(2);
		list1.addNode(2);
		list1.addNode(2);
		list1.addNode(9);
		list1.addNode(9);
		list1.addNode(9);
		
		head1=list1.removeDuplicates(head1);
		System.out.println("size : "+list1.getSize());
		list1.printLinkedList();
	
		
}
}