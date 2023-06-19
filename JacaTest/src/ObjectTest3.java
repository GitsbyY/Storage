public class ObjectTest3 {
	

	   public static void main(String[] args) {
		      // TODO Auto-generated method stub

//		      조건문
//		      윤년구하기?
		      
//		      윤년은 4로 딱 나눠질때 윤년이다
//		      100으로 나눴을때 떨어지는 해는 평년이다 or 400으로 나눴을때 떨어지는 해는 윤년이다.
		      for (int i = 0; i <= 2023; i++) { // 2023까지 루프 돌린다.
		            if ((i % 4 == 0 && i % 100 != 0) // 4로 나눴을때 떨어지고  
		                  || i % 400 == 0 ) {     // 100으로 나눴을때 안떨어지면 윤년이다.
		               System.out.print("윤년 ");
		               System.out.print(i);
		               System.out.println("년");
		            }else { // 4로 나눴을때 안떨어지고
		               System.out.print("----평년 ");      // 100으로 나눴을때 떨어지면 평년이다.
		               System.out.print(i);
		               System.out.println("년");
		            }
		            
		         }
		      }

		}
