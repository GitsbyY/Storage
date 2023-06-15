
public class ScoreProcessProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;

		score = 79;

//		System.out.println(score);
//		
//		if(score >= 90 && score <= 100) {
//			System.out.println("A등급 입니다.");
//		}else if(score >= 80 && score <= 89) {
//			System.out.println("B등급 입니다.");
//		}else if(score >= 70 && score <= 79) {
//			System.out.println("C등급 입니다.");
//		}else if(0< score && score <= 69) {
//			System.out.println("F등급 입니다.");
//		}
//		

		//가장 잘 짠 코드.
		System.out.println(score);

		if (score >= 90 && score <= 100) {//100개가 수행 되고 10개가 사라진다.
			System.out.println("A등급 입니다.");
		} else if (score >= 80) {		  // 10개가 사라진 90개에서 수행된다.	
			System.out.println("B등급 입니다.");
		} else if (score >= 70) {
			System.out.println("C등급 입니다.");
		} else if (0 < score) {
			System.out.println("F등급 입니다.");
		}

	}

}
