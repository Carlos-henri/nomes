package entities;

public class User {

	private String name;
	private Integer number;
	
	public User() {
	}
	
	public User(String name, Integer number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String toString() {
	    return name + ", " + number;
	}
	
}
