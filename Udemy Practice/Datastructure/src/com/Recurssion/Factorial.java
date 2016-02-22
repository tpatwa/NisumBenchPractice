package com.Recurssion;

public class Factorial {

	public static int factorial(int n)
	{
		if(n==0) return 1;
		return n*factorial(n-1);
		
	}
	public static int recTest(int a, int b) { 
		if (b==1) 
		return a; 
		
		return a + recTest(a,b-1); 
	}
	public static void main(String[] args)
	{
		
		//System.out.println(factorial(3));
		System.out.println(recTest(2,3));
	}
}
