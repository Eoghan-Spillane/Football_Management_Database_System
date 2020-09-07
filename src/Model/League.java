//Eoghan Spillane
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name;

	public League() {
		
	}
	
	public League(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String res = "Name: " + this.name;
		
		return res;
		
	}
}
