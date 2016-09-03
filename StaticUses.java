//package com.javacore.practice;

public class StaticUses 

{
	static
	{
		System.out.println("Executing brfore main");
	}
	int i;
	String s;
	static String t = "This is STATIC ";
	
	StaticUses(int a, String b) 
	{
		i = a;
		s = b;
	}
	
	static void changestaticvariable()
	{
		t = "STATIC updated by static method";
	}
	
	void diaplay()
	
	{
		System.out.println(t);
	}
	
	public static void main(String[] args) 
	{
		StaticUses su = new StaticUses(20, "");
		System.out.println(t);
		changestaticvariable();
		su.diaplay();
	}
	
}
