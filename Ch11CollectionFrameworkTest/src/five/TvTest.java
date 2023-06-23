package five;

import java.util.ArrayList;
import java.util.Iterator;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      tv는 총 3개있다
//      tv는 처음 생성되면 서로 다른 값을 할당한다
//      본인이 맘에 드는 tv명을 짓는다
		
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		Tv tv1 = new Tv("지원꺼", 1 , 2, true);
		Tv tv2 = new Tv("찬우꺼", 10 , 6, true);
		Tv tv3 = new Tv("남용꺼", 5 , 4, true);
//
////      모든 값이 설정되면
////      list에 담는다
//		ArrayList<Tv> tvList = new ArrayList<Tv>();

//		Tv tv = null;
//		int tvTotalCount = 100;
//
//		for (int i = 0; i < tvTotalCount; i++) {
//			tv = new Tv("이젠Tv", 3, 7, false);
//			tvList.add(tv);
//		}
		tvList.add(tv1);
		tvList.add(tv2);
		tvList.add(tv3);
		System.out.println(tvList.size());
		System.out.println(tvList);
//		for (int i = 0; i < tvList.size(); i++) {
//			tv = tvList.get(i);
//			
//			tv.volumeUp();
//			
//			tv.info();
//		}
		Iterator<Tv> it = tvList.iterator();

		while (it.hasNext() == true) {
			
			 it.next().info();
			
		}
		
		System.out.println("==================");
		for (Tv a : tvList) {
			a.info();
	
		}
		
		
		
	}

}
