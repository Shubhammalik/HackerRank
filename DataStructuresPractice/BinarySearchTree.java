package com.hr.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTree {
 
	NodeBST root;
	
	public void addNode(int key,String name){

		NodeBST newNode = new NodeBST(key,name);
		
		if(root==null){
		root= newNode;
		}
		else{
			NodeBST current=root;
			NodeBST parent;
			
			while(true)
			{
				parent = current;
				if(key<current.key){
					current = current.leftChild;
					if(current == null){
						parent.leftChild= newNode;
						return;
					}
						
				}
				else{
					current=current.rightChild;
					if(current==null){
						parent.rightChild=newNode;
						return;
					}
				}
			  }
			}
		}
	
	public void addNode(int key){

		NodeBST newNode = new NodeBST(key);
		
		if(root==null){
		root= newNode;
		}
		else{
			NodeBST current=root;
			NodeBST parent;
			
			while(true)
			{
				parent = current;
				if(key<current.key){
					current = current.leftChild;
					if(current == null){
						parent.leftChild= newNode;
						return;
					}
						
				}
				else{
					current=current.rightChild;
					if(current==null){
						parent.rightChild=newNode;
						return;
					}
				}
			  }
			}
		}
	
	
	
	public void inOrderTaversal(NodeBST current)
	{
		if(current!=null){
			inOrderTaversal(current.leftChild);
			System.out.println(current);
			inOrderTaversal(current.rightChild);
		}
	}
	
	public void preOrderTaversal(NodeBST current)
	{
		if(current!=null){
			System.out.println(current);
			preOrderTaversal(current.leftChild);
			preOrderTaversal(current.rightChild);
		}
	}
	
	public void postOrderTaversal(NodeBST current)
	{
		if(current!=null){
			postOrderTaversal(current.leftChild);
			postOrderTaversal(current.rightChild);
			System.out.println(current);
		}
	}
	
	public NodeBST findNode(int key){
		NodeBST current =root;
		
		while(current.key!=key){
		 if(key<current.key){
			current = current.leftChild;
			}
		else{
			current = current.rightChild;
		}
		 if(current==null){
			 System.out.println("Key not found");
				return null;
				}
		 
		}
		return current;
	}
	
	public int findLength(NodeBST current){
		
	if(current==null)
		return 0;
	else
	{ int lLength=0 ,rLength=0;
		if(current.leftChild!=null){
		 lLength = findLength(current.leftChild);
		}
	if(current.rightChild!=null){
		rLength = findLength(current.rightChild);
	}
	  if(lLength>rLength)
			return lLength+1;
		else
			return rLength+1;
	}
	
	}
	
	public void DFS(NodeBST current){
		//DEPTH FIRST SEARCH
		//pushing the top of stack, then right,left and printing the value of currently popped
		Stack<NodeBST> s = new Stack<>();
		s.add(current);
		while(s.isEmpty()==false){
			NodeBST x = s.pop();
			if(x.rightChild!=null){
				s.add(x.rightChild);
				}
			if(x.leftChild!=null){
				s.add(x.leftChild);
				}
			
			System.out.println(x.key);
		
		}
	
	}
	
	public void BFS(NodeBST current){
		//BREADTH FIRST SEARCH
		//adding it to queue and printing it,then add left,right
	Queue<NodeBST> q = new LinkedList<>();
		if(current == null)
			return;
		q.add(current);
		
		while(!q.isEmpty()){
			NodeBST x = q.remove();
			System.out.println(x.key);
			if(x.leftChild!=null){
		
				q.add(x.leftChild);
			}
			if(x.rightChild!=null){
			
				q.add(x.rightChild);
			}
		}
		
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		BinarySearchTree bst1 = new BinarySearchTree();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			bst1.addNode(key);
		}
		bst.addNode(8,"abc");
		bst.addNode(6,"qwe");
		bst.addNode(5,"ads");
		bst.addNode(7,"zxc");
		bst.addNode(14,"poi");
	//	bst.addNode(3,"abc");
	//	bst.addNode(1,"fgh");
		bst.addNode(15,"lkj");
		bst.addNode(10,"mnb");
//		bst.addNode(9,"rgn");
//		bst.addNode(11,"edc");
//		bst.addNode(12,"edc");
//		bst.addNode(13,"edc");
		// uncomment these new nodes to find variation in length
		
		System.out.println("");
		System.out.println("DFS on BST1");
		bst.DFS(bst1.root);
		System.out.println("height of tree : "+bst.findLength(bst.root));
		System.out.println("height of tree : "+bst.findLength(bst1.root));
		System.out.println("");
	
		
		System.out.println("InOrder Traversal");
		bst.inOrderTaversal(bst.root);
		System.out.println("");
		
		System.out.println("PreOrder Traversal");
		bst.preOrderTaversal(bst.root);
		System.out.println("");
		
		System.out.println("PostOrder Traversal");
		bst.postOrderTaversal(bst.root);
		System.out.println("");
		
		NodeBST findKey=bst.root;
		
		System.out.println("DFS on BST");
		bst.DFS(bst.root);
		System.out.println("");
		
		System.out.println("BFS on BST");
		bst.BFS(bst.root);
		System.out.println("");
		
		System.out.println("bst root : "+bst.root.key );
		int key=16	;
		findKey=bst.findNode(key);
	if(findKey!=null){
		System.out.println("finding "+key+" : "+findKey.key+" found");
		}

	}

}
