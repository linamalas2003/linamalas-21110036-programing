package drugs;

public class Tablet extends Drug{
	private String name;
	private int noOfPieces;
	public Tablet(String category, String dateOfManufacture, String company, String name, int noOfPieces) {
		super(category, dateOfManufacture, company);
		this.name = name;
		this.noOfPieces = noOfPieces;
	}
	public Tablet()
	{
		super();
		this.name=" ";
		this.noOfPieces=0;
	}
	public void PrintData()
	{
		super.PrintData();
		System.out.println("tablet information");
		System.out.println("name is "+ name);
		System.out.println("number of pieces is " + noOfPieces);
	}
	

}
