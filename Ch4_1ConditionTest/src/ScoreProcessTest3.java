public class ScoreProcessTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int score = 0;
	String str = "";
	score = 3;
	
	str = (score >= 90) ? "A등급" : (score >=80) ? "B등급" : (score >=70) ? "C등급" 
			:  "F등급" ;
				
	System.out.println(str + "입니다.");
	}
}
