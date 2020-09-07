package Model;


import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class Person {
	@Id
	private String name; //Name object complicated things later on in the program so I removed it.
	private String phone;
	private String email;
	
	public Person() {
		
	}
	
	public Person(String name, String phone) {
		this.name = name.toString();
		this.phone = phone;
		this.email = name + "@mycit.ie";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
