package BUILDER_CREATIONALDESIGNPATTREN;

import java.time.LocalDate;

public class user {
	
	private String firstname;
	private String lastname;
	private LocalDate birthday;
	private Address address;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}

}
