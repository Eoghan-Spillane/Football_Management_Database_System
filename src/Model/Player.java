package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Player extends Person{
	private int goals;
	private boolean goalie;
	private String teamName;
	
	public Player() {
		
	}
	
	public Player(String name, String phone, int goals, boolean goalie) {
		super(name, phone);
		this.setGoalie(goalie);
		this.setGoals(goals);
	}

	public boolean isGoalie() {
		return goalie;
	}

	public void setGoalie(boolean goalie) {
		this.goalie = goalie;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public String getTeam() {
		return teamName;
	}

	public void setTeam(String team) {
		this.teamName = team;
	}

	public String toString() {
		String res = "";
		
		if(this.getTeam() == null) {
			res += "Team: Unassigned";
		}
		else {
			res += "Team: " + this.getTeam().toString();
		}
		
		res += "\t Goalie: " + this.isGoalie();
		if(this.isGoalie()) {
			res += "\t Goals Saved: " + this.getGoals();
		}
		else {
			res += "\t Goals Scored: " + this.getGoals();
		}
		
		res += "\tName: " + this.getName().toString();
		
		return res;
	}
}
