package drugs;

public class PainReliever extends Tablet {
	private int dosageUnit;
	private int useWithinDays;
	public PainReliever(String category, String dateOfManufacture, String company, String name, int noOfPieces,
			int dosageUnit, int useWithinDays) {
		super(category, dateOfManufacture, company, name, noOfPieces);
		this.dosageUnit = dosageUnit;
		this.useWithinDays = useWithinDays;
	}
	public PainReliever()
	{
		super();
		this.dosageUnit=0;
		this.useWithinDays=0;
	}
	public void PrintData()
	{
		super.PrintData();
		System.out.println("pain relieve information");
		System.out.println("dosage unit is "+ dosageUnit);
		System.out.println("number of usage days " +useWithinDays);
	}
	

}
