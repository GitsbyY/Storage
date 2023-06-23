package two;

import java.util.ArrayList;

public class TestArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arrayList를 무조건 써야한다
		
//      그 숫자들에 대해 + 100을 한 값을 출력하시오
		
		ArrayList arrayList = new ArrayList();
		
		
		 for (int i = 0; i < 9; i++) {
	         arrayList.add((i+1) * 2);
	         System.out.println((int)arrayList.get(i) + 100);
	      }
		 
		 System.out.println("=====================남용==========");
		 
		 ArrayList<Integer> guguList = new ArrayList<Integer>();
	      
	      for (int i = 0; i < 9; i++) {
	         guguList.add(2 * (i+1));
	      }
	      
	      System.out.println(guguList);
	      
	      for (int i = 0; i < guguList.size(); i++) {
	         System.out.print(guguList.get(i) + 100 + " ");
	      }
	      
	     System.out.println("============찬우============");
		
	     ArrayList<Integer> list1 = new ArrayList<Integer>();

	      for (int i = 0; i < 9; i++) { // 초기값 저장
	         list1.add((i + 1) * 2);
	      }

	      for (int i = 0; i < list1.size(); i++) {
	         System.out.println("2 * " + (i + 1) + " = " + list1.get(i));
	      }
	      System.out.println("100을 더한 값");
	      
	      for (int i = 0; i < 9; i++) { // 값 변경
	         list1.set(i, (list1.get(i) + 100));
	         //System.out.println(list1);
	      }
	      System.out.println(list1);
//	      for (int i = 0; i < list1.size(); i++) { // 그냥 출력값만 변환해서 출력
//	         System.out.println("2 * " + (i + 1) 
//	               + " = " + (list1.get(i) + 100));
//	      }

	}

}
