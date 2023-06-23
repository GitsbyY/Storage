package seven.ijb;

public class User {

	   String userName = "";
	   String userPassWord = "";
	//  회원가입 할 때 어떤 정보가 필요하지?
	//  3개의 정보를 User 클래스에 만든다      
	   String userPassWordHint = "";
	   String userEMail = "";
	   String userPhoneNumber = "";
	   
	   
	   public User() {
	      super();
	   }


	   public User(String userName, String userPassWord,
	            String userPassWordHint,String userEMail,
	            String userPhoneNumber) {
	      super();
	      this.userName = userName;
	      this.userPassWord = userPassWord;
	      this.userPassWordHint = userPassWordHint;
	      this.userEMail = userEMail;
	      this.userPhoneNumber = userPhoneNumber;
	   }


	   public String getUserID() {
	      return userName;
	   }


	   public void setUserID(String userName) {
	      this.userName = userName;
	   }


	   public String getUserPW() {
	      return userPassWord;
	   }


	   public void setUserPW(String userPassWord) {
	      this.userPassWord = userPassWord;
	   }


	   public String getUserPWHint() {
	      return userPassWordHint;
	   }


	   public void setUserPWHint(String userPassWordHint) {
	      this.userPassWordHint = userPassWordHint;
	   }


	   public String getUserEMail() {
	      return userEMail;
	   }


	   public void setUserEMail(String userEMail) {
	      this.userEMail = userEMail;
	   }


	   public String getUserPhoneNumber() {
	      return userPhoneNumber;
	   }


	   public void setUserPhoneNumber(String userPhoneNumber) {
	      this.userPhoneNumber = userPhoneNumber;
	   }
	   
	//  모든 정보를 출력하는 메서드 하나
	   public void viewUserInfo() {
	      System.out.println("===========사용자 정보===========");
	      System.out.println("사용자 이름: " + userName);
	      System.out.println("사용자 비밀번호: " + userPassWord);
	      System.out.println("사용자 비밀번호 힌트: " + userPassWordHint);
	      System.out.println("사용자 이메일: " + userEMail);
	      System.out.println("사용자 전화번호: " + userPhoneNumber);
	   }

	   @Override
	   public String toString() {
	      return "User [userName=" + userName + 
	            ", userPassWord=" + userPassWord + 
	            ", userPassWordHint=" + userPassWordHint + 
	            ", userEMail=" + userEMail +
	            ", userPhoneNumber=" + userPhoneNumber + "]";
	   }
	}
	

