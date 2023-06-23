package seven;

public class User {
	
	String name = "";
	String birth = "";
	int phoneNumber = 0;
	
	
	public User() {
		super();
	}


	public User(String name, String birth, int phoneNumber) {
		super();
		this.name = name;
		this.birth = birth;
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", birth=" + birth + ", phoneNumber=" + phoneNumber + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
