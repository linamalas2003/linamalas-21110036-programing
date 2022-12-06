package OOP;

public class Shapes {
	private double d1;
	private double d2;
	private double d3;
	static int count=0;
	public Shapes(double d1)
	{
		this.d1=d1;
		count++;
	}
	public Shapes(double d1,double d2)
	{
		this.d1=d1;
		this.d2=d2;
		count++;
	}
	public Shapes(double d1,double d2,double d3)
	{
		this.d1=d1;
		this.d2=d2;
		this.d3=d3;
		count++;
	}
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	public double getD2() {
		return d2;
	}
	public void setD2(double d2) {
		this.d2 = d2;
	}
	public double getD3() {
		return d3;
	}
	public void setD3(double d3) {
		this.d3 = d3;
	}
	public double AreaOfCircle()
	{
			return d1*d1*3.14;	
		
	}
	public double AreaOfTriangle()
	{
			return d1*d2*0.5;	
		
	}
	public double VolumeOfPyramid()
	{
			return (d1*d2*d3)/3;	
		
	}
	
}
