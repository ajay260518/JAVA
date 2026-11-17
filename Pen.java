package oops;

public class Pen {
	String col;
	String com;
	float price;

public Pen(String col,String com,float price) {
	this.col=col;
	this.com=com;
	this.price=price;
	System.out.println("constructor");
}
public static void main(String args[]) {
	Pen p1 = new Pen("red","cello",10.5f);
	System.out.println(p1);
	System.out.println(p1.col);
	System.out.println(p1.com);
	System.out.println(p1.price);
}
}
