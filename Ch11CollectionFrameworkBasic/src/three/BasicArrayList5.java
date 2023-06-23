package three;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
//					제너릭						Generics
//		표현식
//		리스트.add(Object obj)
		
//		list.add("SDf");
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
//		Interger        int
//		Integer intNum = 4; 원래는 이렇게 하면 안 되었다
		Integer intNum = Integer.valueOf(4);
		list.add(intNum);
		
		int num =5;
		list.add(num);
		
		Integer intNum2 = new Integer(6);
		list.add(intNum2);
		
		
//		list.add("문자열1");
//		list.add("문자열2");
//		list.add("문자열3");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.println();
				
		list.set(0, 100);
		
		list.set(3, -44);
				
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
		
		
		
		
		
	
	}
	

}
