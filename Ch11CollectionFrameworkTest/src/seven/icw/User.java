package seven.icw;


public class User {
//  회원가입 할 때 어떤 정보가 필요하지?
//  3개의 정보를 User 클래스에 만든다      
  
//  모든 정보를 출력하는 메서드 하나
  
//  맵에다가 3명 정도의 회원가입을 시킨다
//  
//  키보드 입력을 통해 id와 비번이 일치하면 그 회원의 정보를 모두 출력하시오
	private String name = "";
	private String birth = "";
	private String id = "";
	private String pw = "";
	
	
	public User() {
		super();
	}
	
	public User(String name, String birth, String id, String pw) {
		super();
		this.name = name;
		this.birth = birth.substring(0, 4) + "-" 
		+ birth.substring(4, 6) + "-" + birth.substring(6);
		this.id = id;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void Info() {
		String str = "*";
		String hiddenPw = "";
		for (int i = 0; i < pw.length(); i++) {
			hiddenPw = hiddenPw + str;
		}
		System.out.println("----------------------");
		System.out.println(name + "의 회원 정보 ");
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + hiddenPw);
		System.out.println("----------------------");
	}
	
	public void Info(String mark) {
		System.out.println("----------------------");
		System.out.println(name + "의 회원 정보 " + mark);
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		System.out.println("----------------------");
	}
	

	@Override
	public String toString() {
		return "User [name=" + name + ", birth=" + birth + ", id=" + id + ", pw=" + pw + "]";
	}
	
	
}
