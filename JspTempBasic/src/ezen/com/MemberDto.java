package ezen.com;


public class MemberDto {
	
	private int no;
	private String name;
	private String banName;
	
	
	public MemberDto() {
		super();
	}


	public MemberDto(int no, String name, String banName) {
		super();
		this.no = no;
		this.name = name;
		this.banName = banName;
	}

	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBanName() {
		return banName;
	}


	public void setBanName(String banName) {
		this.banName = banName;
	}


	@Override
	public String toString() {
		return "BanDto [no=" + no + ", name=" + name + ", banName=" + banName + "]";
	}
	
	
}
