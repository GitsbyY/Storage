package one;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      10, 20, 30,,,, 100까지 들었는 리스트를 만든다.
//      
//      숫자에서 오름차순으로 데이터를 remove하여
//      
//      모든 리스트 데이터를 삭제하시오.

//      리스트 생성
      ArrayList arrayList = new ArrayList();

      int num = 10;

//      리스트 입력
      for (int i = 1; i <= num; i++) {
         arrayList.add(i * 10);
      }
      System.out.println("입력 완료");
      
//      리스트 출력
      for (int i = 0; i < arrayList.size(); i++) {
         System.out.print(arrayList.get(i) + " ");
      }
      
      System.out.println();
      
//      리스트 삭제 과정
      System.out.println();
      System.out.println("삭제 과정");
      
      //case1
//      for (int i = 0; i < num; i++) {
//         arrayList.remove(0);
//         System.out.println("===========================");
//         for (int j = 0; j < arrayList.size(); j++) {
//            System.out.print(arrayList.get(j) + " ");
//         }
//         System.out.println();
//      }
//      System.out.println();
//      System.out.println("삭제 완료");
      
      //case2
      for (int i = 0; i < arrayList.size(); i++) {
         arrayList.remove(i);
         System.out.println("===========================");
         System.out.println(arrayList);
         i--;
      }
      System.out.println();
      System.out.println("삭제 완료");

		
		
		
	}

}
