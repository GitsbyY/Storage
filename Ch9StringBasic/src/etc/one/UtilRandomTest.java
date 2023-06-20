package etc.one;

import java.util.Random;

public class UtilRandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Random rand = new Random(10);
	      
//	      int num = rand.nextInt();
	      
//	      System.out.println(num);
	      int num = 0;		
	      						   //seed
	      Random rand2 = new Random(10);
	      int randNum = 0;
	      
//	      randNum = rand2.nextInt();
	      
//	      System.out.println(randNum);
	      
	      for (int i = 0; i < 5; i++) {
	    	  num = rand.nextInt();
		      
		      System.out.println("위 : " + num);
		      
		      randNum = rand2.nextInt();
		      
		      System.out.println("아래 : " + randNum);
		}
	      
	      Random rand3 = new Random();
	      int num1 = 0;
	      num1 = rand3.nextInt(10);
	      
	      System.out.println(num1);

	}

}
