package ASB_system;
public class MainClass {

	public static void main(String[] args) {
		// Initializing minimum and maximum values for random time and random question
		int minTime;
		int maxTime;
		int minQuestion;
		int maxQuestion;
		 // Creating 10 teams with unique team ids and names
		Team team1 = new Team(102, "coders-HTU");
		Team team2 = new Team(103, "codeWizard-JUST");
		Team team3 = new Team(104, "syntaxSquad-JU");
		Team team4 = new Team(105, "debuggers-HU");
		Team team5 = new Team(106, "BitBuster-YU");
		Team team6 = new Team(107, "coderCo-PSUT");
		Team team7 = new Team(108, "avengers-HBTU");
		Team team8 = new Team(109, "cyberSquad-IU");
		Team team9 = new Team(110, "codeCrew-AAU");
		Team team10 = new Team(112, "codeCrush-BAU");
		// Creating Scoreboard object
		ScoreBoard board = new ScoreBoard();
		// Adding teams to Scoreboard
		board.addTeam(team1);
		board.addTeam(team2);
		board.addTeam(team3);
		board.addTeam(team4);
		board.addTeam(team5);
		board.addTeam(team6);
		board.addTeam(team7);
		board.addTeam(team8);
		board.addTeam(team9);
		board.addTeam(team10);
		// Creating a RandomGenerator object
		RandomGenerator r = new RandomGenerator();
	 // Running a loop for 300 iterations which represents the time passing
		for (int i = 0; i < 300; i++) {
			// Setting minimum and maximum time values
			minTime = 10;
			maxTime = 30;
			// Setting minimum and maximum question values
			minQuestion = 0;
			maxQuestion = 2;
			//If i is divisible by 30, simulate the next 30 minutes
			if (i % 30 == 0) {
				//looping through all teams to update their values of question solved and elapsed time
				for (int j = 0; j < board.getTeams().size(); j++) {
					 // Setting the solved questions and elapsed time for each team using random values
					board.getTeams().get(j).setQuestionSolved(
							board.getTeams().get(j).getQuestionSolved() + r.getRandomValue(minQuestion, maxQuestion));
					board.getTeams().get(j).setElapsedTime(
							board.getTeams().get(j).getElapsedTime() + r.getRandomValue(minTime, maxTime));
					 // If the number of solved questions for a team is greater than 10, setting it to 10
					if (board.getTeams().get(j).getQuestionSolved() > 10) {
						board.getTeams().get(j).setQuestionSolved(10);
						
					}
					
				}
				 // If a team has not solved any question, setting its elapsed time to 0
				for (int j = 0; j < board.getTeams().size(); j++) {
					if (board.getTeams().get(j).getQuestionSolved() == 0) {
						board.getTeams().get(j).setElapsedTime(0);
					}
				}
				//sort the teams based on questions answered and elapsed time 
				board.sortTeams();
				//display the output
				board.DispalyResult();

			}

		}


	}

}
