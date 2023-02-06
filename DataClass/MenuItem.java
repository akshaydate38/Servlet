package com.hc.DataClass;

import java.util.Comparator;
import com.fasterxml.jackson.annotation.JsonBackReference;

public class MenuItem {

	private int id;
	private String name;
	@JsonBackReference
	private MenuItem parent;

	public MenuItem(int id, String name) {

		super();
		this.id = id;
		this.name = name;
	}

	public MenuItem() {

	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MenuItem getParent() {
		return parent;
	}

	public void setParent(MenuItem parent) {
		this.parent = parent;
	}
	//public void display() {
	//	System.out.println(id+" "+name);
	//}

	//	@Override
	//	public int compareTo(MenuItem o) {
	//		return this.getId()-o.getId();
	//	}

	//	public void back(MenuItem m) {
	//		if(m.getParent()!=null){
	//		
	//			display();
	//		}else {
	//			System.exit(0);
	//		}
	//	}
	//	}
	//	

	public class Sorting implements Comparator<MenuItem>{
		public int compare(MenuItem o1, MenuItem o2) {

			return o1.getId()-o2.getId();
		}

	}
}
