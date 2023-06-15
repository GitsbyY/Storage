public class ScoreProcessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		String str = "";
		
		score = 84;
		
		System.out.println(score);

		if (score >= 90) {
			str = "A등급 입니다.";
		} else if (score >= 80) {
			str = "B등급 입니다.";
		} else if (score >= 70) {
			str = "C등급 입니다.";
		} else{
			str = "F등급 입니다.";
		}
		System.out.println(str);		
	}
	
	//char를 쓰면 훨씬 빠른 처리가 가능하다. 하지만, 변화에 취약하다는 점이 있다.

}
