package Exception_propagation;

public class calling_methods_throws_keyword
{
	public static void run() throws InterruptedException /// called method
	{
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		try
		{
			run();
		}
		catch(InterruptedException e) 
		{
			System.out.println("handling");
		}

	}

}
