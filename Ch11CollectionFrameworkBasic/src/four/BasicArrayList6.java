package four;

import java.util.ArrayList;

public class BasicArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassRoom cr = new ClassRoom();
		cr.banName = "API 자바";
		cr.studentCountCapacity = 16;
		
//		cr.info();
		
		ClassRoom cr2 = new ClassRoom("AI", 10);
		
//S		cr2.info();
		
		ArrayList<ClassRoom> classRoomList = new ArrayList<ClassRoom>();
		
		classRoomList.add(cr);
		classRoomList.add(cr2);
		
		classRoomList.get(0).info();
		
		classRoomList.get(0).banName = "Open API Java";
		
		classRoomList.get(0).info();
		
		
		ClassRoom myTempInstanceVar = null;
		
		myTempInstanceVar = classRoomList.get(1);
		
		myTempInstanceVar.info();
		
		
		
	}

}
