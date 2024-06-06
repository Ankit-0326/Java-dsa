package com.demo.test;

import com.demo.linklist.Mylinkedlist;

public class test {

	public static void main(String[] args) {
		Mylinkedlist Mylist = new Mylinkedlist();

		 Mylist.addNode(2);
		 Mylist.addNode(3);
		 Mylist.addNode(4);
		 Mylist.addNode(0);
		 Mylist.addAtanyPosition(20,1);
		 Mylist.addAtanyPosition(20,2);
		 Mylist.display();
	}

}
