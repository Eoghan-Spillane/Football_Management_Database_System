package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Team {
	@Id
	private String name;
	private String colour;
	private String leagueName;
	
	public Team() {
		
	}
	
	public Team(String string, String string2) {
		this.name = string;
		this.colour = string2;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String toString() {
		String res = "";
		res += "Colour: " + this.colour;
		res += "\tTeam Name: " + this.name;
		if(this.leagueName == null) {
			res += "\tLeague: Unassigned";
		}
		else {
			res += "\tLeague: " + this.leagueName.toString();
		}
		
		
		return res;
	}
}
