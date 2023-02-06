package com.hc.DataStructure;

import java.util.Arrays;

public class dsQueue {

	private int maxSize;
	private int[] queueArray;
	private int  rear;
	private int front ;

	public dsQueue(int size) {
		maxSize = size;
		queueArray = new int[maxSize];
		rear = 0;
		front=0;
	}

	public void enQueue(int value) {
		if (!isFull()) { 
			queueArray[front] = value;
			front++;

		} else {
			resize(maxSize * 2);
			enQueue(value);
		}
	}
	public void deQueue() {
		if (!isEmpty()) { 
			queueArray[rear]=0;
			front--;
		}
		if (front < maxSize/2) {
			try {
				trimToSize();
				resize(maxSize / 2);
			}catch(Exception e){
				System.out.println("The Queue is already empty");
				//return -1;
			}
		}
		//   if(isEmpty()) 
		//   {
		//		   System.out.println("The Queue is already empty");
		//   }
	}
	public void trimToSize()
	{
		int temp[] = new int[front];
		for (int i=0; i < front; i++){
			temp[i] = queueArray[i];
		}
		queueArray = temp;
		maxSize = queueArray.length;

	}
	public int peek() {
		if (!isEmpty()) { 
			return queueArray[front]; 
		} else {
			System.out.println("The Queue is empty, cant peek");
			return -1;
		}
	}

	private void resize(int newSize) {
		int[] transferArray = new int[newSize];

		for (int i = 0; i < queueArray.length; i++) {
			transferArray[i] = queueArray[i];
		}
		queueArray = transferArray;
		maxSize = newSize;
	}

	public boolean isEmpty() {
		return (rear == -1);
	}
	public void printElements(){
		System.out.println("elements in Queue are :"+Arrays.toString(queueArray));
	}
	public boolean isFull() {
		return (front == maxSize);
	}

	public void Search(int index){
		if(index>=maxSize || index<0 ||queueArray[index]==0 ){
			System.out.println("No element present!...");
		}
		else{
			System.out.println("Element present:  "+queueArray[index]);
		}
	}
	public void updateElement(int index, int element){
		if (maxSize == front||index>=maxSize || index<0){
			resize(16); 
		}

		if (!isFull()) { 
			for(int i=front;i>=index;i--){
				queueArray[i+1] = queueArray[i];
			}
			queueArray[index] = element;
			maxSize++;
		}
	}
	
	 // to get an element at an index
	public int getElement(int index){
		return queueArray[index];
	}
}
