package LiberaryMangmentSystem;

import java.util.Scanner;

public class MainApp 
{

	public static void main(String[] args) 
	{
		Library l=new Library();
		Scanner sc=new Scanner(System.in);
		boolean isStart=true;
		while(isStart)
		{
			System.out.println("enter the choice:\n 1.addbook \n 2.display \n 3.searchbook based on the id \n"
					+ " 4.searchbook based on the author \n 5.update book costbased on the title \n "
					+ "6.remove the book based on the id \n 7. exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("enter a book title");
				String title=sc.next();
				System.out.println("enter a book id");
				int id=sc.nextInt();
				System.out.println("enter a book cost");
				int cost=sc.nextInt();
				System.out.println("enter a no of pages ");
				int noofpages=sc.nextInt();
				System.out.println("enter a book author ");
				String author=sc.next();
				l.addBook(new Book(title,id,cost,noofpages,author));
			}
			break;
			case 2:
			{
				l.displayBook();
			}
			break;
			case 3:
			{
				System.out.println("enter a id to search book");
				int id=sc.nextInt();
				l.searchBookBasedOnId(id);
			}
			break;
			case 4:
			{
				System.out.println("enter a author name to find book");
				String author=sc.next();
				l.searchBookBasedOnAuthor(author);
			}
			break;
			case 5:
			{
				System.out.println("enter a title update cost ");
				String title=sc.next();
				l.updateBookCostBasedOnTitle(title);
			}
			break;
			case 6:
			{
				System.out.println("enter a id based on the remove book");
				int id=sc.nextInt();
				l.removeBookBasedOnId(id);
			}
			break;
			case 7:
			{
				isStart=false;
				System.out.println("thanks exit from app");
			}
			break;
			default:System.out.println("enter valid choice");
			
			}
		}
	}
}

