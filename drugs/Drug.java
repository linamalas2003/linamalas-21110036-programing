package drugs;

public class Drug {
	private String category;
	private String DateOfManufacture;
	private String company;
	public Drug(String category, String dateOfManufacture, String company) {
		this.category = category;
		DateOfManufacture = dateOfManufacture;
		this.company = company;
	}
	public Drug() {
		this.category=" ";
		this.DateOfManufacture="";
		
	}
	
	public void PrintData()
	{
		System.out.println("drug information");
		System.out.println("category is "+ category);
		System.out.println("date of manufacture is " + DateOfManufacture);
		System.out.println("company is "+ company);
	}
	

}
