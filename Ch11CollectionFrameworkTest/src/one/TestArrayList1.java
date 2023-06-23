package one;

import java.util.ArrayList;

public class TestArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      10, 20, 30,,,, 100까지 들었는 리스트를 만든다
//      
//      
//      숫자에서 오름차순으로 데이터를 remove하여 
//      
//      모든 리스트 데이터를 삭제하시오
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(80);
		arrayList.add(90);
		arrayList.add(100);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("인덱스위치 : " + i + " - " + arrayList.get(i));
		}
		
		System.out.println("=======remove=======");
		
		for (int i = arrayList.size(); i > 1; i--) {
			arrayList.remove(0);
			System.out.println(arrayList);
		}
		
		
//		for (int i = arrayList.size(); i > 1; i--) {
//			arrayList.remove((i-1));
//			System.out.println(arrayList);
//			System.out.println(""+(i-1) + "번" + arrayList.get(i-2));
//		}
		
		
		
		
		
	}

}
