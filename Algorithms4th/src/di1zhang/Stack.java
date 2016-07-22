package chapter_one;

import java.util.Iterator;

public class Stack<Item>{
	private Node first;//栈顶（最近添加元素）
	private int N;//元素数量
	private class Node{
	//定义节点的嵌套类
		Item item;
		Node next;
		
	}
	public boolean isEmpty(){
		return first==null;
		
	}
	public int size(){
		return N;
	}
	public void push(Item item){
		//向栈顶添加元素
		Node oldfirst = first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
		N++;
		
	}
	public Item pop(){
		//从栈顶删除元素
		Item item = first.item;
		first = first.next;
		N--;
		return item;		
	}
	
	
	
}
	
