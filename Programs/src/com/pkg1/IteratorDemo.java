package com.pkg1;


// Demonstrate iterators.
import java.util.*;
class IteratorDemo {
public static void main(String args[]) {
// create an array list
ArrayList al = new ArrayList();
// add elements to the array list
al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
// use iterator to display contents of al
System.out.print("Original contents of al: ");
Iterator itr = al.iterator();
while(itr.hasNext()) {
Object element = itr.next();
System.out.print(element + " ");
}
}
}