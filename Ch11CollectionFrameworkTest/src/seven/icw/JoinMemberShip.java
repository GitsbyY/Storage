package seven.icw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class JoinMemberShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      회원가입 할 때 어떤 정보가 필요하지?
//      3개의 정보를 User 클래스에 만든다      

//      모든 정보를 출력하는 메서드 하나

//      맵에다가 3명 정도의 회원가입을 시킨다
//      
//      키보드 입력을 통해 id와 비번이 일치하면 그 회원의 정보를 모두 출력하시오
		String name = "";
		String birth = "";
		String id = "";
		String pw = "";

		Message m = new Message();

		Map<String, User> userInfoMap = new HashMap<String, User>();
		ArrayList<String> nameList = new ArrayList<String>();

		userInfoMap.put("유효준", new User("유효준", "19900101", "hujun", "hujun90"));
		nameList.add("유효준");

		userInfoMap.put("손진원", new User("손진원", "19900303", "jinwon", "jinwon90"));
		nameList.add("손진원");

		userInfoMap.put("조남용", new User("조남용", "19990204", "namyong", "namyong999"));
		nameList.add("조남용");
		Scanner scan = new Scanner(System.in);
		
/////////////////////////////회원가입 구현////////////////////////////////////////
//		System.out.println("회원가입을 진행합니다.");
//
//		m.nameMessage(); // 이름 입력
//		name = scan.nextLine();
//		System.out.println();
//		
//		m.birthMessage(); // 생년월일 입력
//		while (true) {
//			birth = scan.nextLine();
//			if (birth.length() == 8) {
//				break;
//			}else {
//				System.out.println("형식에 맞지 않습니다 다시입력해주세요");
//				System.out.print("생년월일 : ");
//			}
//			
//		}
//		
//		System.out.println();
//		
//		m.idMessage(); // 아이디 입력
//		id = scan.nextLine();
//		System.out.println();
//
//		m.pwMessage(); // pw 입력
//		pw = scan.nextLine();
//		System.out.println();
//
//		
//		System.out.println("비밀번호가 맞는지 재입력 해주세요.");
//		String checkPw = "";
//		while (true) {
//
//			checkPw = scan.nextLine();
//			if (pw.equals(checkPw)) {
//				System.out.println("비밀번호가 동일합니다.");
//				System.out.println("계정을 생성합니다.");
//				break;
//			} else {
//				System.out.println("비밀번호가 틀립니다. 다시입력해주세요");
//			}
//
//		}
//
//		userInfoMap.put(name, new User(name, birth, id, pw));
//		nameList.add(name);
///////////////////////////골라서 볼수 있게 구현///////////////////////////////////////////////////////
//		System.out.println("회원 정보 출력");
//		System.out.println("1) 특정 인원 \t 2) 전체 인원 \t 3) 보지 않는다.");
//		System.out.println("번호를 입력해주세요");
//		int num = Integer.parseInt(scan.nextLine());
//		switch (num) {
//		case 1:
//			m.choiceShowInfoMessage();
//			name = scan.nextLine();
//			System.out.println();
//			userInfoMap.get(name).Info();
//			break;
//		case 2:
//			for (int i = 0; i < userInfoMap.size(); i++) {
//				userInfoMap.get(nameList.get(i)).Info();
//			}
//			
//			break;
//		case 3:
//			scan.close();
//			break;
//		default:
//			System.out.println("잘못 입력했으니 종료");
//			break;
//		}
//
/////////////////////////////////////////////////////////////////////////////
		System.out.println("회원 정보 출력");
		String inPutId = ""; // 아이디 입력
		String inPutPw = ""; // 비밀번호 입력
		int executionsNum = 0;
		int stopPoint = 0; // 비밀번호 5번 틀리면 종료됨
		int endPoint = nameList.size(); // 아이디 없다는 표시 1번만 호출하고 싶음 (근데 안됨..)
		boolean stop = true;
		while (stop) {
			System.out.println("아이디를 입력하세요");
			System.out.print("ID : ");

			inPutId = scan.nextLine();
			executionsNum++;
			for (String checkName : nameList) {
				// 입력한 아이디가 nameList(키값 저장용)으로 for문으로 수행하여 유저의 객체를 저장한
				// 곳의 아이디와 일치하면 비밀번호도 맞는지 확인한다.
				if (userInfoMap.get(checkName).getId().equals(inPutId)) {
					System.out.println("비밀번호를 입력하세요");
					System.out.print("PASSWORD : ");
					inPutPw = scan.nextLine();
					if (userInfoMap.get(checkName).getPw().equals(inPutPw)) {
						System.out.println("비밀번호까지 보시겠습니까?");
						System.out.println("1) YES  \t 2) NO");
						switch (Integer.parseInt(scan.nextLine())) {
						case 1:
							userInfoMap.get(checkName).Info("(비밀번호 포함)");
							break;
						case 2:
							userInfoMap.get(checkName).Info();
							break;
						default:
							break;
						}
						
						stop = false;
						break;
//					} else {
//						System.out.println(stopPoint + "회 비밀번호가 틀렸습니다.");
//						stopPoint++;
//					}
//
//				} else {
//					if (endPoint == executionsNum) {
//						System.out.println("없는 아이디 입니다. 다시 입력해주세요");
//						endPoint = 0;
//					}
//					if (stopPoint == 5) {
//						System.out.println("비밀 번호 5회 틀렸습니다. 종료합니다.");
//						return;
					}

				}

			}

		}

	}

}
