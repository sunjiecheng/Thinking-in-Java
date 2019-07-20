// typeinfo/Ex10.java
// TIJ4 Chapter Typeinfo, Exercise 10, page 562
// Write a program to determine whether an array of char is a primitive type
// or a true object.

public class Ex10 {	
	public static void main(String[] args) {
		char[] c = new char[10];
		// c is an object:
		System.out.println("Superclass of char[] c: " + 
			c.getClass().getSuperclass());
		System.out.println("char[] c instanceof object: " +
			(c instanceof Object));
	}
}