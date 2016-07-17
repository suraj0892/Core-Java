package com.pkg1;

import java.util.Iterator;
import java.util.LinkedList;


	class MailList {
	public static void main(String args[]) {
	LinkedList ml = new LinkedList();
	// add elements to the linked list
	ml.add(new Address("J.W. West", "11 Oak Ave",
	"Urbana", "IL", "61801"));
	ml.add(new Address("Ralph Baker", "1142 Maple Lane",
	"Mahomet", "IL", "61853"));
	ml.add(new Address("Tom Carlton", "867 Elm St",
	"Champaign", "IL", "61820"));
	Iterator itr = ml.iterator();
	while(itr.hasNext()) {
	Object element = itr.next();
	System.out.println(element + "\n");
	}
	System.out.println();
	}
	}
