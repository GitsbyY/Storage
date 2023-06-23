package four;

public class ClassRoom {
	
	String banName = "";
	int studentCountCapacity = 0;
	
	
	
	public ClassRoom() {
		super();
	}

	public ClassRoom(String banName, int studentCountCapacity) {
		super();
		this.studentCountCapacity = studentCountCapacity;
		this.banName = banName;
	}
	
	void info() {
		
		System.out.println(banName + "반의 정보");
		
		System.out.println("반 이름 : " + banName);
		System.out.println("수용인원 : " + studentCountCapacity);
		
		
		System.out.println();
	}
	
	
	
	
	
}
