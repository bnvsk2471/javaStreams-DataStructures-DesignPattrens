package Streams;

public class StudentObj {
	
	private Integer Id;
	private String firstName;
	private String lastName;
	private String Gender;
	private Integer age;
	
	public StudentObj(Integer Id, String firstName, String lastName,String Gender, Integer age) {
		this.Id=Id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Gender=Gender;
		this.age=age;
	}
	public StudentObj() {
		
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		this.Id=id;
	}
	
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setId(String Gender) {
		this.Gender=Gender;
	}
	
	
	public Integer getage() {
		return age;
	}
	public void setage(Integer age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return "StudentObj [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", Gender=" + Gender
				+ ", age=" + age + "]";
	}
	

}
