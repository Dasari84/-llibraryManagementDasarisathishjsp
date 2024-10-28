package LiberaryMangmentSystem;

public class Book 
{
	private String title;
	private int id;
	private int cost;
	private int noofpages;
	private String author;
	
	public Book() {
		
	}

	public Book(String title, int id, int cost, int noofpages, String author) {
		super();
		this.title = title;
		this.id = id;
		this.cost = cost;
		this.noofpages = noofpages;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoofpages() {
		return noofpages;
	}

	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void display()
	{
		System.out.println("booktitle:"+getTitle());
		System.out.println("bookid:"+getId());
		System.out.println("bookcost:"+getCost());
		System.out.println("booknoof pages:"+getNoofpages());
		System.out.println("bookauthor:"+getAuthor());
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "\n id=" + id + "\n cost=" + cost + "\n noofpages=" + noofpages + "\n author="
				+ author + "\n getTitle()=" + getTitle() + "\n getId()=" + getId() + "\n getCost()=" + getCost()
				+ "\n getNoofpages()=" + getNoofpages() + "\n getAuthor()=" + getAuthor() + "]";
	}
	
}
