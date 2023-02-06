package com.hc.DataStructure;

import java.util.Arrays;

public class dsStack {

	private int maxSize;
    private int[] stackArray;//stack representation 
    private int top;

     public dsStack(int size) {
         maxSize = size;
         stackArray = new int[maxSize];//stack initialization
         top = -1;
    }

    public void insertItem(int value) {
        if (!isFull()) { // Checks for a full stack
            top++;
            stackArray[top] = value;
            
        } else {
            resize(maxSize * 2);
            insertItem(value);
        }
    }
 
     public void deleteElement()
     {
    	 if (!isEmpty()) { // Checks for an empty stack
    		 stackArray[top]=0;
        	 //top--;

               //tackArray[top];
              top--;
         }
         if (top < maxSize/2) {
        	 try {
        		 trimToSize();
             resize(maxSize / 2);
        	 }catch(Exception e){
                 System.out.println("The stack is already empty");
                 //return -1;
            }
             
        }
//       if(isEmpty()) 
//       {
//    	   System.out.println("The stack is already empty");
//       }
     }
       public void trimToSize()
       {
           //System.out.println("Trimming the array");
           int temp[] = new int[top+1];
           for (int i=0; i < top+1; i++){
               temp[i] = stackArray[i];
           }
           stackArray = temp;
           maxSize = stackArray.length;
   }

    public int peek() 
    {
        if (!isEmpty()) { // Checks for an empty stack
             return stackArray[top]; 
        } else {
            System.out.println("The stack is empty, cant peek");
            return -1;
        }
    }

    private void resize(int newSize) {
         int[] transferArray = new int[newSize];

         for (int i = 0; i < stackArray.length; i++) {
             transferArray[i] = stackArray[i];
             //stackArray = transferArray;
         }
         stackArray = transferArray;
         maxSize = newSize;
    }

     public boolean isEmpty() {
         return (top == -1);
     }
     public void printElements(){
         System.out.println("elements in stack are :"+Arrays.toString(stackArray));
     }

     public void searchElement(int index){
         if(index>=maxSize || index<0|| stackArray[index]==0){
            System.out.println("No element present!...");
         }
         else{
         	System.out.println("Element present:  "+stackArray[index]);
     	}}
     public void updateElement(int index, int element){
         if (maxSize == top+1||index>=maxSize || index<0){
        	 resize(16); 
         }
   
         if (!isFull()) { // Checks for a full stack
         
         for(int i=top+1;i>=index;i--){
        	 stackArray[i+1] = stackArray[i];
         }
         stackArray[index] = element;
         maxSize++;
     }}
     public int getElement(int index){
         return stackArray[index];
     }
     public boolean isFull() {
         return (top + 1 == maxSize);
      }
}
