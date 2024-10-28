package Exception_propagation;

import java.util.Scanner;

public class final_keyword {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A value");
		int a=sc.nextInt();
		System.out.println("enter B value");
		int b=sc.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("re_enter value");
			b=sc.nextInt();
		}
		finally
		{
			System.out.println("always be there");
		}
		
		
		
		
		
	}

}
