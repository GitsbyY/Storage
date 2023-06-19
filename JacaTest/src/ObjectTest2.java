public class ObjectTest2 {
//조건문 테스트

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub

//	      조건문
//	      윤년구하기?
	      
//	      윤년은 4로 딱 나눠질때 윤년이다
	      
	      for (int i = 0; i <= 2023; i++) {
	            if ((i % 4 == 0 && i % 100 != 0)|| i % 400 == 0 ) {
	               System.out.print("윤년 ");
	               System.out.print(i);
	               System.out.println("년");
	            }else if (i % 100 == 0 || i % 4 != 0) {
	               System.out.print("----평년 ");
	               System.out.print(i);
	               System.out.println("년");
	            }
//	            else {
//	               System.out.print("윤년 ");
//	               System.out.print(i);
//	               System.out.println("년");
//	            }
	            
	         }
	      }



}
