package seven.pmy;

public class User {
//  회원가입 할 때 어떤 정보가 필요하지?
//  3개의 정보를 User 클래스에 만든다      
  
//  모든 정보를 출력하는 메서드 하나
  
//  맵에다가 3명 정도의 회원가입을 시킨다
	
//  키보드 입력을 통해 id와 비번이 일치하면 그 회원의 정보를 모두 출력하시오
	
	private String id = "";
	private String pwd = "";
	private String name = "";
	private int birthDay = 0;
	private String nickName = "";
	
	public User() {
		super();
	}

	public User(String id, String pwd, String name, int birthDay, String nickName) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birthDay = birthDay;
		this.nickName = nickName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void viewUserInfo() {
		System.out.println("이름: " + name);
		System.out.println("생년월일: " + birthDay);
		System.out.println("닉네임: " + nickName);
		
		System.out.println();
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", birthDay=" + birthDay + ", nickName="
				+ nickName + "]";
	}
	
	
	
}
