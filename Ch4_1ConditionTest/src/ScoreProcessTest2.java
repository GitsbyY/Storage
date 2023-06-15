public class ScoreProcessTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		String str = "";
		
		score = 84;
		
		str = "등급입니다.";
		
		System.out.println(score);

		if (score >= 90) {
			System.out.println("A" + str);
		} else if (score >= 80) {
			System.out.println("B" + str);
		} else if (score >= 70) {
			System.out.println("C" + str);
		} else{
			System.out.println("F" + str);
		}
				
	}
	
	//char를 쓰면 훨씬 빠른 처리가 가능하다. 하지만, 변화에 취약하다는 점이 있다.

}
