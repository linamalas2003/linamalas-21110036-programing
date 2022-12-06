package OOP;

public class lab11 {

	public static void main(String[] args) {
		Shapes s1= new Shapes(3);
		double areaOfCircle=s1.AreaOfCircle();
		Shapes s2=new Shapes(3,6);
		double areaOftriangle= s2.AreaOfTriangle();
		Shapes s3=new Shapes(3,4,2);
		double volumeOfPyrimad=s3.VolumeOfPyramid();
		System.out.println("the number of objects is  "+Shapes.count);
		System.out.println("the area of the circle is  "+ areaOfCircle);
		System.out.println("the area of triangle is  "+areaOftriangle);
		System.out.println("the volume of pyrimad is  "+volumeOfPyrimad);
	}

}
