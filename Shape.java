//package com.javacore.practice;

public class Shape
{
		int l, b, h;
		float r;
		String s;
		
		
		void area(String s, int l, int b, int h)
		{
			System.out.println("Shape" + s + "Area is" + (l*b*h));
		}
		
		void area (String s, float r )
		{
			System.out.println("Shape" + s + "Area is " + (3.14*r*r) );
		}
		
		
		public static void main(String[] args) 
		{
	 	 Shape s1 = new Shape();
	 	 System.out.println("Default values" + s1.l + s1.b + s1.h +  s1.r + s1.s);
	 	 s1.area("Rec",2,4,5);
	 	 s1.area("Ci", 7);
		}



}

