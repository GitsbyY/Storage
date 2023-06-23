package seven.pmy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import five.Tv;

public class UserMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, User> userMap = new HashMap<String, User>();

		User user1 = new User("mi0", "p123456", "박미영", 930906, "PMU");
		User user2 = new User("yun", "k5678910", "김태윤", 980316, "KTY");
		User user3 = new User("jun", "qwer123", "이승준", 981125, "LSJ");

		userMap.put(user1.getId(), user1);
		userMap.put(user2.getId(), user2);
		userMap.put(user3.getId(), user3);

		Scanner scan = new Scanner(System.in);

		while(true) {
			try {
				
				System.out.println("ID를 입력해주세요.");
				String id = scan.nextLine();

				System.out.println("비밀번호를 입력해주세요.");
				String pwd = scan.nextLine();

				System.out.println();

				if (userMap.get(id).getPwd().equals(pwd) == true) {
					System.out.println("반갑습니다. " + id + "님");
					System.out.println();

					userMap.get(id).viewUserInfo();
					break;
				} else {
					System.out.println("ID 또는 비밀번호가 틀렸습니다");
				}
				
			} catch (NullPointerException n) {
				System.out.println("다시 입력해 주세요.");
			}
		}
		
	}

}
