package ASB_system;
//Class to keep track of the scores of all teams in a contest
import java.util.ArrayList;

public class ScoreBoard {
	//An arraylist of Team objects to store all teams participating in the contes
	private ArrayList<Team> teams;
	//default constructor that initializes the teams arraylist
	public ScoreBoard() {
		teams=new ArrayList<>();
	}
	//getter and setter method to get and set the list of teams
	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	//method to add a team to the teams arraylist
	public void addTeam(Team team)
	{
		teams.add(team);
	}
	//method to sort teams based on the number of questions solved and elapsed time
	public void sortTeams()
	{
		//flag variable to check if sorting is complete
		boolean flag=true;
		//continue sorting until sorting is complete
		while(flag)
		{
			//set flag to false to start sorting
			flag=false;
			//loop through the arraylist of teams
			for(int i=0;i<teams.size()-1;i++)
			{
				// if the current team has solved less questions than the next team
				if(teams.get(i).getQuestionSolved()<teams.get(i+1).getQuestionSolved())
				{
					// set flag to true to continue the loop
					flag=true;
					// swap the current team and the next team
					Team temp=teams.get(i);
					teams.set(i, teams.get(i+1));
					teams.set(i+1, temp);
					
				}
				// if both teams have solved the same number of questions
				else if(teams.get(i).getQuestionSolved()==teams.get(i+1).getQuestionSolved())
				{
					// if the current team has a higher elapsed time than the next team
					if(teams.get(i).getElapsedTime()>teams.get(i+1).getElapsedTime())
					{
						// swap the current team and the next team
						Team temp=teams.get(i);
						teams.set(i, teams.get(i+1));
						teams.set(i+1, temp);
					}
				}
				
			}
		}
	}
	public void DispalyResult()
	{
		// variable to store the place for each team (e.g. 1st, 2nd, 3rd, etc.)
		String place="";
		System.out.println("#########################################################################################");
		System.out.println("#\tRank\t#\tTeam ID\t#\tTeam Name\t#Solved Questions#Elapsed Time\t#");
		System.out.println("#########################################################################################");
		// loop through all the teams in the list
		for(int i=0;i<teams.size();i++)
		{
			// determine the place for the current team based on its rank
		    if(i==1)
		    {
		        place="st";
		    }
		    else if(i==2)
		    {
		        place="nd";
		    }
		    else if(i==3)
		    {
		        place="rd";
		    }
		    else 
		    {
		        place="th";
		    }
		    // display the information for the current team
		    System.out.println("#\t"+(i+1)+place+"\t#\t"+teams.get(i).getId()+"\t#\t"+teams.get(i).getName()+"\t#\t"+teams.get(i).getQuestionSolved()+"\t#\t"+teams.get(i).getElapsedTime()+"\t#");
		}
		System.out.println("#########################################################################################");

		
		
		
		
	}


}
