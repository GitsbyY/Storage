package six;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> nameMap = new HashMap<String, String>();
		
		nameMap.put("손진원", "선행학습만 한다");
		nameMap.put("조남용", "어 그거 아닌데");
		nameMap.put("임찬우", "난 종이비행기가 아니라 우주선을 만들거야");
		nameMap.put("임정빈", "살려주세요");
		nameMap.put("박지훈", "넌 4 야");
		
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		String printNname = "";
		System.out.println("이름을 입력해주세요.");

		name = sc.next();
		
		printNname = nameMap.get(name);
		
//		System.out.println(nameMap.get(sc.next()));
		
		
		
	}

}
