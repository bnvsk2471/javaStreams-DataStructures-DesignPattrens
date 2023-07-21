package StreamsEntity;
public class StudentEntity {
	
	private String Name; 
	private Integer age;
	public StudentEntity(String name, Integer age) {
		super();
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentEntity [Name=" + Name + ", age=" + age + "]";
	}

}
