package com.hr.thirtydays;

import java.util.*;
class NodeBST{
    NodeBST left,right;
    int data;
    NodeBST(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day23BSTLevelOrder {
	// Print Level Order Traversal of BST
	static void levelOrder(NodeBST root){
	     
		 Queue<NodeBST> q = new LinkedList<>();
	        q.add(root);
	        while(!q.isEmpty()){
	            NodeBST x = q.remove();
	            System.out.print(x.data+" ");
	            if(x.left!=null){q.add(x.left);}
	            if(x.right!=null){q.add(x.right);}
	            
	        }
	      
	    }
	
	public static NodeBST insert(NodeBST root,int data){
        if(root==null){
            return new NodeBST(data);
        }
        else{
            NodeBST cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            NodeBST root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

