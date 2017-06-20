package com.hr.practice;

public class NodeBST {
int key;
String name;

NodeBST leftChild;
NodeBST rightChild;

public NodeBST(int key,String name){

	this.key=key;
	this.name=name;	
}

public NodeBST(int key){
	this.key=key;
}

public String toString(){
	return "key :"+key+" name : "+name;


}

}
