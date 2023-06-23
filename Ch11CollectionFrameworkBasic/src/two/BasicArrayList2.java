package two;

import java.util.ArrayList;

public class BasicArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList = new ArrayList();
		//중복을 허용하기에 5가 두 번 들어가도 된다.
		//add -> 인서트다. 값을 삽입한다
		arrayList.add("Winter is Coming");
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add("오 설마 이런 것도 되나?");
		arrayList.add(1);
		arrayList.add(999);
		arrayList.add(123.123);
		arrayList.add("오 설마 이런 것도 되나?");
		int num = 0;
		int temp = 0;
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("인덱스위치 : " + i + " - " + arrayList.get(i));
		}
		
//		for (int i = 0; i < arrayList.size(); i++) {
//			
//			num = arrayList[i];
//			num = num + 100;
//			temp = num;
//		}
//		
		for (int i = 0; i < arrayList.size(); i++) {
	         System.out.println((int)arrayList.get(i) + 100);
	      }
		
//		System.out.println("================remove(0)=================");
//		arrayList.remove(0);
		
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println("인덱스위치 : " + i + " - " + arrayList.get(i));
//		}
		
//		System.out.println("================remove(\"오 설마 이런 것도 되나?\")=================");
//		arrayList.remove("오 설마 이런 것도 되나?");
//		
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println("인덱스위치 : " + i + " - " + arrayList.get(i));
//		}
		
		
	}

}
