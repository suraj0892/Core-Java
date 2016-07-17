package com.pkg1;

//Demonstrate an inner class.
class Outer {
int outer_x = 100;
void  test() {
	System.out.println("inside test");
Inner inner = new Inner();
inner.display();
}
//this is an inner class
class Inner {
void display() {
System.out.println("display: outer_x = " + outer_x);
}
}
}
class InnerClassDemo {
public static void main(String args[]) {
Outer outer = new Outer();
outer.test();
Outer.Inner in = outer.new Inner();
in.display();
}
}