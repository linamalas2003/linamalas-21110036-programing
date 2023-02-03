package ASB_system;
//Class to represent a team in a contest
public class Team {
	// attributes to store team ID, team name, number of questions solved, and elapsed time
	private int id;
	private String name;
	private int questionSolved;
	private int elapsedTime;
	// Constructor to initialize the team object with team ID and team name
	public Team(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		questionSolved=0;// Setting initial value of number of questions solved to 0
		elapsedTime=0;// Setting initial value of elapsed time to 0		
	}
	// Getter and setter methods for team ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Getter and setter methods for team name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Getter and setter methods for number of questions solved
	public int getQuestionSolved() {
		return questionSolved;
	}
	public void setQuestionSolved(int questionSolved) {
			this.questionSolved = questionSolved;
	}
	// Getter and setter methods for elapsed time
	public int getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
}
