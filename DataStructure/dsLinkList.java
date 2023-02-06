package com.hc.DataStructure;

public class dsLinkList {

	private Node head;//by using head & tail we do insert first, last operation within constant time otherwise while tail!=null
	private Node tail;
	int size;
	
	public dsLinkList() { 
	
		this.size = 0;
	}

	public void insertFirst(int data) {
		Node node= new Node(data);
		node.next=head;
		head=node;
		if(tail==null){   //1st  node
		
			tail=head;
		}
		size+=1;

	}

	public void Display()
	{
		Node temp=head;//take temp node pointing same head first position 
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("End");
	}
	public void insert(int index, int data) {
		if(index==0) {
		
			insertFirst(data);
			return;
		}
		if(index==size) {
		
			insertLast(data);
			return;
		}
		try {
		
			Node temp=head;//0th index
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			Node node =new Node(data,temp.next);

			temp.next=node;
			size++;
		}catch(Exception e) {
			System.out.println("NullPointerException thrown!...");
		}

	}

	public void insertLast( int data){
	
		if(tail==null) {
		
			insertFirst(data);
		}
		Node node=new Node(data);
		tail.next=node;
		tail=node;
		size++;
	}
	public int deleteFirst()
	{
		int data= head.data;
		head=head.next;
		if(head==null)
		{
			tail=null;//empty
		}
		size--;
		return data;
	}
	public int deleteLast()
	{
		if(size<=1)
		{
			return deleteFirst();
		}
		int data=tail.data;
		Node secondandLast=get(size-2);
		tail=secondandLast;
		tail.next=null;
		return data;
	}
	public void delete(int index)
	{
		if(index==0)
		{
			deleteFirst();
		}
		if(index==size-1)
		{
			deleteLast();
		}
		try {
			Node prev=get(index);
			
			@SuppressWarnings("unused")
			
			int val=prev.next.data;
			prev.next=prev.next.next;
			//return val;
		}catch(Exception e) {
			System.out.println("NullPointerException Thrown!...");
		}
		//return val;
	}

	public Node find(int data) {
		Node node=head;
		while(node!=null) 
		{
			if(node.data==data)
			{
				System.out.println("Number is present");
				return node;
			}
			node=node.next;

		}
		System.out.println("Number is not present");
		return null;
	}

	public Node get(int index)
	{
		Node node=head;
		for(int i=1;i<index;i++)
		{
			node=node.next;
		}
		return node;
	}


	private class Node
	{
		private int data;
		private Node next;

		public Node(int data, Node next) 
		{
			this.data = data;
			this.next = next;
		}

		public Node(int data) {
			this.data = data;	
		}

	}

}
