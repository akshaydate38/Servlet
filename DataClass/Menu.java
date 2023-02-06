package com.hc.DataClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hc.DataStructure.dsArray;
import com.hc.DataStructure.dsLinkList;
import com.hc.DataStructure.dsQueue;
import com.hc.DataStructure.dsStack;

public class Menu  extends MenuItem{

	Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	private static boolean isLevelOne = true;
	List<MenuItem> items = new ArrayList<>();

	@JsonManagedReference
	private Map<Integer, MenuItem> listmap;
	public Menu() {
		super();
	}
	public Menu(String s) {
		super(0,s);
	}
	public Menu(int mi_index, String name) {
		super(mi_index, name);
		//addMenuItem(new MenuItem(0, "Back"));
	}
	public List<MenuItem> getItems() {
		Collections.sort(items,new Sorting());
		return items;
	}
	public void addMenuItem(MenuItem item) {
		item.setParent(this);
		items.add(item);
	}
	public void setList(Map<Integer, MenuItem>items) {
		this.listmap=items;
	}

//	public void back(MenuItem m)
//	{
//		if(m.getParent()!=null)
//		{
//			//displayMi();
//		}
//		else {
//			System.exit(0);
//		}
//	}
	public static final dsArray dae=new dsArray(2);
	public static final dsStack dse=new dsStack(2);
	public static final dsQueue dqe=new dsQueue(2);
	public static final dsLinkList dle=new dsLinkList();

//	public void displayMi() {
//		if(isLevelOne) {
//			isLevelOne=false;        //level separate karnetrue false true
//			//Collections.sort(getItems(),new Sorting());
//
//			items.forEach(e->e.display());//list array stack queue linklist
//			isLevelOne=true;
//			System.out.println("Enter choice..!");
//			int choice=sc.nextInt();
//			if(choice==0) {
//				System.out.println("Invalid choice..!");
//				displayMi();
//			}
//			else {
//
//				//Collections.sort(getItems(),new Sorting());
//				MenuItem mi=getItems().stream().filter(e->e.getId()==choice).findFirst().orElse(null);//sort by choice
//				if(mi==null) {
//					System.out.println("Invalid input..!");//mi instance of Menu :to check whether your getting obj of that class or not
//					displayMi();
//				}else if(mi instanceof Menu) {
//
//					//((Menu) mi).getItems().forEach(e->e.display());
//					// write code here
//					if(mi.getName()=="Array") {
//
//						while(true) {
//							((Menu) mi).getItems().forEach(e->e.display());//getting list of menu item
//							System.out.println("Enter choices:");
//							int choic=sc.nextInt();
//
//							switch (choic) {
//
//							case 0:
//								back(mi);
//								break;
//
//							case 1:
//								try {
//									System.out.println("Enter size of an array");
//									int n=sc.nextInt();
//									System.out.println("Enter elements of an array");
//									for(int i=0;i<n;i++) { 
//
//										dae.insertItem(sc.nextInt()); 
//									}
//								}
//								catch(Exception e) {
//									System.out.println("Exception thrown!...");
//								}
//								break;
//
//							case 2:
//								dae.printElements();
//								break; 
//
//							case 3:
//								System.out.println("After pop:");           
//								dae.deleteElement();
//								dae.printElements();
//								break;
//
//							case 4:        
//								System.out.println("Peek Element:"+dae.peek()); 
//								dae.printElements();
//								break;  
//
//							case 5:
//								System.out.println("Enter index for search:");
//								dae.searchElement(sc.nextInt());
//								break;
//
//							case 6:
//								System.out.println("Enter element for update() :");
//								int num=sc.nextInt();
//								System.out.println("Enter Index:");
//								int index=sc.nextInt();							
//								dae.updateElement(index,num);
//								dae.printElements();
//								break;
//
//							}
//							//((Menu) mi).getItems().forEach(e->e.display());
//						}
//					}
//					else if(mi.getName()=="Stack") {
//						while(true) {
//							((Menu) mi).getItems().forEach(e->e.display());
//							System.out.println("Enter choices:");
//							int ch=sc.nextInt();   	 		    
//
//							switch(ch) {
//							case 0:
//								back(mi);
//								break;
//
//							case 1:
//								try {
//									System.out.println("Enter size of an Stack");
//									int n=sc.nextInt();
//									System.out.println("Enter elements of an Stack");
//									for(int i=0;i<n;i++) {
//
//										dse.insertItem(sc.nextInt()); 
//									}
//								}
//								catch(Exception e) {
//									System.out.println("Exception thrown!..");
//								}
//								break;
//
//							case 2:
//								dse.printElements();
//								break;
//
//							case 3:
//								System.out.println("After pop:");
//								dse.deleteElement();
//								dse.printElements();
//								break;
//
//							case 4:
//								System.out.println(dse.peek());
//								dse.printElements();
//								break;
//
//							case 5:
//								System.out.println("Enter index for search:");
//								dse.searchElement(sc.nextInt());
//								break;
//
//							case 6:System.out.println("Enter element for update() :");
//							int num=sc.nextInt();
//							System.out.println("Enter Index:");
//							int index=sc.nextInt();
//
//							dse.updateElement(index,num);
//							dse.printElements();
//							break;
//
//							}
//						}
//					}
//					else if(mi.getName()=="Queue") {
//						while(true) {
//							((Menu) mi).getItems().forEach(e -> e.display());
//							System.out.println("Enter choices:");
//							int cho=sc.nextInt();
//
//							switch (cho){
//
//							case 0:
//								back(mi);
//								break;
//
//							case 1:
//								System.out.println("Enter size of an Queue");
//								int n=sc.nextInt();
//								System.out.println("Enter elements of an Queue");
//								for(int i=0;i<n;i++) {
//									dqe.enQueue(sc.nextInt()); 
//								}
//								break;
//
//							case 2:
//								dqe.printElements();
//								break;
//
//							case 3:
//								System.out.println("After deQueue:");           
//								dqe.deQueue(); 
//								dqe.printElements();
//								break;
//
//							case 4:       
//								System.out.println("Peek Element:"+dqe.peek());
//								dqe.printElements();
//								break;
//
//							case 5:
//								System.out.println("Enter index for search:");
//								dqe.Search(sc.nextInt());
//								break;
//
//							case 6:System.out.println("Enter element for update() :");
//							int num=sc.nextInt();
//							System.out.println("Enter Index:");
//							int index=sc.nextInt();
//
//							dqe.updateElement(index,num);
//							dqe.printElements();
//							break;
//
//							}
//						}
//					}
//					else if(mi.getName()=="LinkedList") {
//						while(true) {
//
//							((Menu) mi).getItems().forEach(e -> e.display());
//							System.out.println("Enter choice");
//							int choic=sc.nextInt();
//
//							switch(choic) {
//							case 0:
//								back(mi);
//								break;
//
//							case 1:
//								System.out.println("Enter size of an LinkedList");
//								int n=sc.nextInt();
//								System.out.println("Enter elements of an LinkedList");
//								for(int i=0;i<n;i++) {
//									dle.insertFirst(sc.nextInt());
//								}
//								dle.Display();           	    	
//								break;
//
//							case 2:
//								System.out.println("Enter Index:");
//								int index=sc.nextInt();
//								System.out.println("Enter number:");
//								int num=sc.nextInt();
//								dle.insert(index, num);
//								dle.Display();
//								break;
//
//							case 3:
//								System.out.println("Enter Index:");
//								int in=sc.nextInt();
//								dle.delete(in);
//								dle.Display();
//								break;
//
//							case 4:
//								System.out.println("Enter number:");
//								int Num=sc.nextInt();
//								dle.find(Num);
//
//							}
//						}
//					}
//				}
//			}
//		}
//	}

}
