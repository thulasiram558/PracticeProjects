package com;

class Bank 
{
		float getRateOfInterest()
		{
			return 6.7f;
		}
}

	class SBI extends Bank
	{
		@Override
		float getRateOfInterest()
		{
			return 6.0f;
		}
	}
	class HDFC extends Bank
	{
		@Override
		float getRateOfInterest()
		{
			return 6.5f;
		}
		
	}
	class ICICI extends Bank
	{
		@Override
		float getRateOfInterest()
		{
			return 6.3f;
		}	
	}
	
public class MethodOverridingDemo 
{

	public static void main(String[] args) 
	{
		SBI obj = new SBI();
		System.out.println("The rate of interest of SBI = ");
		System.out.println(obj.getRateOfInterest());
		
		
		//Dynamic binding assigning child class object to parent reference class
		Bank obj1 = new HDFC();
		System.out.println("The rate of interest of HDFC = ");
		System.out.println(obj1.getRateOfInterest());
	}
}
	
	
