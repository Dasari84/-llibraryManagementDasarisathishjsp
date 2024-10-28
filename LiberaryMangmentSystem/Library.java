package LiberaryMangmentSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Library 
{
	private int libId;
	private String loc;
	
	private Book b;
	private ArrayList<Book> book=new ArrayList();
	
	// to add the method
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("book is add successfully");
	}
	//display method
	public void displayBook() 
	{
		if(book.isEmpty())
		{
			System.out.println("book are not added yet..");
		}
		else
		{
			for (Book b:book)
			{
				b.display();
			}
		}
	}
	// searching book based on the id
	public void searchBookBasedOnId(int id)
	{
		boolean isfound=false;
		if(book.isEmpty())
		{
			System.out.println("book is not yet added.....");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("book is found..."+b.getTitle());
					isfound=true;
				}
			}
		}
		if(isfound==false)
		{
			System.out.println("you enter a invalid id....");
		}
	}
	//searchbook based on the author
	public void searchBookBasedOnAuthor(String author)
	{
		boolean isfound=false;
		if(book.isEmpty())
		{
			System.out.println("book is  not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor().equals(author))
				{
					System.out.println("book is found..."+b.getTitle());
					isfound=true;
				}
			}
		}
		if(isfound==false)
		{
			System.out.println("your enter a invalid author name.....");
		}
	}
	//update book cost based on title
	public void updateBookCostBasedOnTitle(String title)
	{
		boolean isupdate=false;
		if(book.isEmpty())
		{
			System.out.println("book is not yet added:");
		}
		else
		{
			for(Book b:book) 
			{
				if(b.getTitle().equals(title))
				{
					b.setCost(1000);
					System.out.println("cost is updateddd......");
					isupdate=true;
				}
			}
		}
		if(isupdate==false)
		{
			System.out.println("you enter a invalid titlename.....");
		}
	}
	public void removeBookBasedOnId(int id)
	{
		Iterator<Book> itr=book.iterator();
		boolean isremoved=false;
		if(book.isEmpty())
		{
			System.out.println("book is not yet added....");
		}
		else
		{
			while(itr.hasNext())
			{
				Book b=itr.next();
				
				if(b.getId()==id)
				{
					itr.remove();
					System.out.println("to remove the book from database");
					isremoved=true;
				}
			}
		}
		if(isremoved==false)
		{
			System.out.println("you invalid book id...book is not added");
		}
	}
	
}

