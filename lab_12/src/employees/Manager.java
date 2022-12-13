package employees;

public class Manager {
	private String name;
	private int ExperinceYear;
	private int baseSalary;
	private String emp_id;
	
	public Manager(String name, int ExperinceYear, int baseSalary, String emp_id) {
		this.name = name;
		this.ExperinceYear = ExperinceYear;
		this.baseSalary = baseSalary;
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperinceYear() {
		return ExperinceYear;
	}

	public void setExperinceYear(int experinceYear) {
		ExperinceYear = experinceYear;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	

}
	
