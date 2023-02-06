package com.hc.lds;

import com.hc.DataClass.Menu;
import com.hc.DataClass.MenuItem;

public class MenuStore {
	public static final MenuStore INSTANCE = new MenuStore();

	private final Menu mainMenu;
	private final Menu stackMenu;
	private final Menu queueMenu;
	private final Menu ArrayMenu;
	private final Menu ListMenu;

	public Menu getMainMenu() {
		return mainMenu;
	}
	public Menu getStackMenu() {
		return stackMenu;
	}
	public Menu getQueueMenu() {
		return queueMenu;
	}
	public Menu getArrayMenu() {
		return ArrayMenu;
	}
	public Menu getLinkMenu() {
		return ListMenu;
	}
	private MenuStore() {
		mainMenu=new Menu(0,"Data Structure");

		stackMenu=new Menu(2, "Stack");
		ListMenu=new Menu(4, "LinkedList");
		ArrayMenu=new Menu(1, "Array");
		queueMenu=new Menu(3, "Queue");

		mainMenu.addMenuItem(ArrayMenu);
		mainMenu.addMenuItem(stackMenu);
		mainMenu.addMenuItem(queueMenu);
		mainMenu.addMenuItem(ListMenu);

		ArrayMenu.addMenuItem(new MenuItem(1, "Insert"));
		ArrayMenu.addMenuItem(new MenuItem(3, "Delete"));
		ArrayMenu.addMenuItem(new MenuItem(4, "Update"));
		ArrayMenu.addMenuItem(new MenuItem(5, "Search"));
		ArrayMenu.addMenuItem(new MenuItem(0, "Back"));
		ArrayMenu.addMenuItem(new MenuItem(2, "Display"));

		stackMenu.addMenuItem(new MenuItem(0, "Back"));
		stackMenu.addMenuItem(new MenuItem(1, "Push"));
		stackMenu.addMenuItem(new MenuItem(2, "Pop"));
		stackMenu.addMenuItem(new MenuItem(3, "Peek"));
		stackMenu.addMenuItem(new MenuItem(4, "Update"));
		stackMenu.addMenuItem(new MenuItem(5, "Search"));

		queueMenu.addMenuItem(new MenuItem(0, "Back"));
		queueMenu.addMenuItem(new MenuItem(1, "Enqueue"));
		queueMenu.addMenuItem(new MenuItem(2, "Dequeue"));
		queueMenu.addMenuItem(new MenuItem(3, "Peek"));
		queueMenu.addMenuItem(new MenuItem(4, "Update"));
		queueMenu.addMenuItem(new MenuItem(5, "Search"));

		ListMenu.addMenuItem(new MenuItem(0, "Back"));
		ListMenu.addMenuItem(new MenuItem(1, "Insert"));
		ListMenu.addMenuItem(new MenuItem(2, "Delete"));
		ListMenu.addMenuItem(new MenuItem(3, "Update"));
		ListMenu.addMenuItem(new MenuItem(4, "Search"));

		//mainMenu.displayMi();
		//Collections.sort(listMenu);
		//listMenu.displayMi();

	}
}
