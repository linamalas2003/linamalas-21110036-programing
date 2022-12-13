package services;

public class Salary {
	public static double calculateSalary(double baseSalary,int exp_year,String emp_ID)
	{
		char a=emp_ID.charAt(0);
		if(a=='m' || a=='M')
		{
			return baseSalary + exp_year*50 +100;
		}
		else if(a=='s'||a=='S')
		{
			return baseSalary+exp_year*50;
		}
		else 
			return -1;
	}

}
