package com.hr.practice;

public class LinkedListCustom {
	NodeLinkedList head;
	int count;
	
	public LinkedListCustom(NodeLinkedList head)
	{
		this.head=head;
		count=1;
	}
	
	//Methods
	
	//add
	public void addNode( int newData)
	{
		NodeLinkedList temp=new NodeLinkedList(newData);
		NodeLinkedList current = head;
		while(current.getNext()!=null)
		{
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}	
	//get
	public int getNode(int index){
		if(index<=0)
			return -1;
		NodeLinkedList current = head;
		for(int i =1;i<index;i++){
			current=current.getNext();
		}
		return current.getData();
	}
	
	//size
	public int getSize(){
		return count;
	}
	public int length(){
		return count;
	}
	
	//isEmpty
	public Boolean isEmpty(){
	return head == null;
	}
	
	//remove
	public void removeNode(){
		NodeLinkedList current = head;
		if(current.getNext()!=null){
		while(current.getNext().getNext()!=null)
		{current=current.getNext();
		}
		}
		current.setNext(null);
		count--;
	}
	
	public NodeLinkedList removeDuplicates(NodeLinkedList head){
		// 999 1111 22222  --> 912
		// Restriction --> Only take ascending ordered list
		// else will return one item for repeating set of duplicates E.g - 331122222333339933 --> 312393 
		NodeLinkedList current = head;
	        while(current.getNext()!=null){
	            if(current.getData()==current.getNext().getData()){
	                current.setNext(current.getNext().getNext());
	                count--;
	            }
	            else{
	            	current = current.getNext();
	            	
	            }
	        }
	return head;
	    }
	
	
	// remove at particular index
	public void removeNodeAtIndex(int index){
		if(index<=0 || index > count)
			System.out.println("Node doesn't exists");
		else
			{NodeLinkedList current = head;
		if(index == 1){
			deleteListHead(index);
		}
		else{
		for(int i=1;i<index-1;i++){
			current= current.getNext();
		}
		
			NodeLinkedList temp = current.getNext().getNext();
			current.setNext(null);
			current.setNext(temp);
		count--;
		}
			}
	}
	
	private void deleteListHead(int index) {
		NodeLinkedList current = head;
		head = current.getNext();
		current = null;
		count--;
		
	}

	public void printLinkedList(){
		NodeLinkedList current = head;
		while(current.getNext()!=null){
			System.out.println(current.getData());
			current=current.getNext();
		}
		System.out.println(current.getData());
	}
	
	
	

}
