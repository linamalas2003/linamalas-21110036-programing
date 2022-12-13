package mainDriven;
import employees.*;
import services.*;
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager emp1=new Manager("ahmad",5,2500,"M3201");
		Staff emp2=new Staff("sondos",3,1500,"s6092","IT");
		Trainer emp3=new Trainer("ali",8);
		double num1=services.Salary.calculateSalary(2500, 5, "M3201");
		double num2 =Salary.calculateSalary(1500, 3, "s6092");
		double num3= Revenue.calculateRevenue(8);
		double num4=Tax.calculateTax(num1);
		double num5=Tax.calculateTax(num2);
		System.out.println( emp1.getName()+" " +num1+" the tax is " +num4 );
		System.out.println(emp2.getName()+ " "+ num2+ "the tax is"+ num5);
		System.out.println(emp3.getName()+ "  revenue is"+num3);
		
		

	}

}
