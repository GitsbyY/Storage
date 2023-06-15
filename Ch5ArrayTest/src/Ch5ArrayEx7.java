
public class Ch5ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		총점과 평균을 구하자
		
//		국영수 3개의 점수의 총점과 평균구하기
//		평균은 소수점 3번째에서 올림한다.
		
//		총점 : ???
//		평균 : ???
		double sum = 0; 
        double average = 0.0;
        
        double[] score = {78.2, 88.7, 57};
        
        for(int i=0; i<3; i++) 
        {
            sum = sum + score[i];    
        }
        
        average = (int)((sum /3)*100 + 1) / 100.0;  
        
        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    
	}

}
