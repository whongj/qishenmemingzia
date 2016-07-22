package chapter_one;

import java.util.Iterator;

import org.junit.Test;


public class Bag<Item> implements Iterable<Item>
{

	private Node first;
	private class Node{
		Item item;
		Node next;
		
	}
	@Test
	public void add(Item item)
	{//  和stack的push 方法相同	

		Node oldfirst = first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
	}
	@Test
	@Override
	public Iterator<Item> iterator() 
	{
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current =first;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current !=null;
		}
	
		
		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
}
