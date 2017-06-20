package com.hr.practice;

public class NodeLinkedList {
	int data;
	NodeLinkedList next;
	
	public NodeLinkedList(int newData){
		this.data = newData;
		next=null;
	}
	public NodeLinkedList(int newData,NodeLinkedList newNext){
		this.data = newData;
		next=newNext;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int newData){
		this.data=newData;
	}
	public NodeLinkedList getNext(){
		return next;
	}
	
	public void setNext(NodeLinkedList newNode){
		this.next=newNode;
	}
}
