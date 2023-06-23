package seven.ijb;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TestMap2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner sc = new Scanner(System.in);
      
      Map<String, User> userMap = new HashMap<String, User>();
      
      User user1 = new User("임정빈", "apple", "사과", "qwe@naver.com", "010-1234-5678");
      User user2 = new User("박지훈", "banana", "바나나", "asd@gmail.com", "010-2345-6789");
      User user3 = new User("이현수", "mango", "망고", "zxc@yahoo.com", "010-3456-7890");
      
//      맵에다가 3명 정도의 회원가입을 시킨다
      userMap.put("dlawjdqls", user1);
      userMap.put("qkrwlgns", user2);
      userMap.put("dlgustn", user3);
      
//      키보드 입력을 통해 id와 비번이 일치하면 그 회원의 정보를 모두 출력하시오
      
      String checkUserIDStr = null;
      String checkUserPassWordStr = null;
      
      System.out.println("아이디를 입력하세요.");
      checkUserIDStr = sc.nextLine();
      
      System.out.println("비밀번호를 입력하세요.");
      checkUserPassWordStr = sc.nextLine();
      
      if(userMap.get(checkUserIDStr).userPassWord.equals(checkUserPassWordStr)) {
         System.out.println("비밀번호가 일치합니다");
         System.out.println("로그인 되었습니다.");
         
         System.out.println("반갑습니다. " + checkUserIDStr + "님");
         userMap.get(checkUserIDStr).viewUserInfo();
      }else {
         System.out.println("id 또는 비밀번호가 틀렸습니다.");
      }
      
      
   }

}
