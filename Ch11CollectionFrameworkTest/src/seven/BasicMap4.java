package seven;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import seven.User;


public class BasicMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		  회원가입 할 때 어떤 정보가 필요하지?
//		  아이디 비번 제외한 세개의 정보를 user 클래스에 만든다
//		  모든 정보를 출력하는 메서드 하나
//		맵에 3명 회원가입
//		키보드 입력으로 아이디 비번 일치시 정보 모두 출력

		Scanner sc = new Scanner(System.in);
		Map userMap = new HashMap<String, String>();

		User user1 = new User("손진원", "1990년 03월 03일", 1234);
		User user2 = new User("조남용", "1999년 02월 04일", 1235);
		User user3 = new User("임찬우", "1996년 12월 21일", 1236);

		userMap.put("sjw", "0303");
		userMap.put("jny", "0204");
		userMap.put("icw", "1221");

		String id = "";
		String pwd = "".trim();

		System.out.println("아이디를 입력 해 주세요");
		id = sc.next();
		System.out.println("비밀번호를 입력 해 주세요");
		pwd = sc.next();

		System.out.println();
		//User user = null;
		
		
//	      String checkIdStr = "";
		
		

			if (userMap.get(id).equals(pwd) == true) {
				
				if (userMap.containsKey("sjw")) {
				System.out.println("로그인 되었습니다.");
				System.out.println("반갑습니다. " + user1.getName() + "님");
				System.out.println(user1);
			}else if (userMap.containsKey("jny")) {
					System.out.println("로그인 되었습니다.");
					System.out.println("반갑습니다. " + user2.getName() + "님");
					System.out.println(user2);
			}else if (userMap.containsKey("icw")) {
					System.out.println("로그인 되었습니다.");
					System.out.println("반갑습니다. " + user3.getName() + "님");
					System.out.println(user3);
			}else {
				System.out.println("id 또는 비밀번호가 틀렸습니다.");
			}
		}
		
		
		

	}

}
