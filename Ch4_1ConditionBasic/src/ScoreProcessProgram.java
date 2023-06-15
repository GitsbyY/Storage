
public class ScoreProcessProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;

		score = 91;

		if (score >= 90 && score <= 100) {
			System.out.println(score + "\n" + "A등급 입니다.");
		} else if (score >= 80 && score <= 89) {
			System.out.println(score);
			System.out.println("B등급 입니다.");
		} else if (score >= 70 && score <= 79) {
			System.out.println(score);
			System.out.println("C등급 입니다.");
		} else if (0 < score && score <= 69) {
			System.out.println(score);
			System.out.println("F등급 입니다.");
		}

	}

}
