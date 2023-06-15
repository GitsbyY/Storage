
public class Ch5ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {70, 88, 91, 33};
		int tmp = 0;
		
		for(int i = 0; i < score.length - 1; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		System.out.println("최대값 : " + score[score.length - 1]);
		System.out.println("최대값 : " + score[0]);
	}

}
