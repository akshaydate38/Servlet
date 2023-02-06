package com.hc.DataStructure;

import java.util.Arrays;

public class dsArray {

	private int maxSize;
	private int[] array;
	private int count;

	public dsArray(int size) {
		maxSize = size;
		array = new int[maxSize];
		count = 0;
	}

	public dsArray() {
		// TODO Auto-generated constructor stub
	}

	public void insertItem(int value) {
		if (count  != maxSize) { 
			array[count] = value;
			count++;
		} else {
			resize(maxSize * 2);
			insertItem(value);
		}
	}

	public void deleteElement() {
		if (count!=0) { 
			array[count-1]=0;
			count--;
		}
		if (count-1 < maxSize/2) {
			trimToSize();
			System.out.println("The Array is already empty");

		}

	}
	public void trimToSize()
	{
		int temp[] = new int[count];
		for (int i=0; i < count; i++){
			temp[i] = array[i];
		}
		array = temp;
		maxSize = array.length;



		//return -1;


	}

	public int peek() {
		if (count!=0) { // Checks for an empty stack
			return array[count-1]; 
		} else {
			System.out.println("The Array is empty, cant peek");
			return -1;
		}
	}

	private void resize(int newSize) {
		int[] transferArray = new int[newSize];

		for (int i = 0; i < array.length; i++) 
		{
			transferArray[i] = array[i];
		}
		array = transferArray;
		maxSize = newSize;
	}

	public void printElements(){
		System.out.println("elements in array are :"+Arrays.toString(array));
	}
	public void searchElement(int index){
		if(index>=maxSize || index<0|| array[index]==0){
			System.out.println("No element present!...");
		}
		else{
			System.out.println("Element present:  "+array[index]);
		}}
	public void updateElement(int index, int element){
		if (maxSize == count||index>=maxSize || index<0){
			resize(16); 
		}

		for(int i=count;i>=index;i--){
			array[i+1] = array[i];
		}
		array[index] = element;
		maxSize++;
	}
	public int getElement(int index){
		return array[index];
	}
}
