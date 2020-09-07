package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Manager extends Person{
	private String dob;
	private int rating;
	private String teamName;
	
	public Manager() {
		
	}
	
	public Manager(String name, String phone, String dob, int rating) {
		super(name, phone);
		this.dob = dob;
		this.rating = rating;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTeam() {
		return teamName;
	}

	public void setTeam(String teamName) {
		this.teamName = teamName;
	}
	
	public String toString() {
		String res = "";
		res += "DOB: " + this.dob;
		res += "\t\tRating: " + this.rating;
		res += "\tName: " + this.getName().toString();
		
		if(this.getTeam() == null) {
			res += "\tTeam: Unassigned";
		}
		else {
			res += "\tTeam: " + this.getTeam().toString();
		}
		
		
		return res;
	}
}
