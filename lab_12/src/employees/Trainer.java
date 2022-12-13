package employees;

public class Trainer {
	private String name;
	private int trainingHours;
	public Trainer(String name, int trainingHours) {
		this.name = name;
		this.trainingHours = trainingHours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTrainingHours() {
		return trainingHours;
	}
	public void setTrainingHours(int trainingHours) {
		this.trainingHours = trainingHours;
	}
	

}
