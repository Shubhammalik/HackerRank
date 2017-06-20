package com.hr.practice;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		NodeLinkedList head = new NodeLinkedList(1);
		LinkedListCustom list = new LinkedListCustom(head);
	
		//adding to list
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		
		//printing list
		list.printLinkedList();
		
		// getting size
		System.out.println("size : "+list.getSize());
		
		//checking isEmpty
		System.out.println("list empty : "+list.isEmpty());
		
		//removing last item from list
		list.removeNode();
		
		//printing again
		list.printLinkedList();
		System.out.println("size : "+list.getSize());
		
		//removing from particular index
		list.removeNodeAtIndex(1);
		
		list.printLinkedList();
		System.out.println("size : "+list.getSize());
	
	}

}
