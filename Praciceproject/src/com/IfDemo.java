package com;

public class IfDemo 
{
	static void withdraw() 
	{
		System.out.println("Money is withdrawn");
	}
public static void main(String[] args)
{ 
	int balance = 100;
	if(balance>500)
		IfDemo.withdraw();
	System.out.println("Simple if demonstraton");
}
}
