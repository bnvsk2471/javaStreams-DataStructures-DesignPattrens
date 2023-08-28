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
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public user(String firstname, String lastname, LocalDate birthday, Address address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.address = address;
	}
	

}
