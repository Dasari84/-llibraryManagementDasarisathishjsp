package Exception_propagation;

import java.util.Scanner;

public class final_keyword2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		try
		{
			System.out.println(a/b);
		}
		finally
		{
			System.out.println("always be there");
		}
	}

}
