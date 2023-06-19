public class ObjectTest4 {
	

	   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		      for (int i = 0; i <= 2023; i++) {
		          if (i % 4 == 0) {
		             System.out.println("==================");
		             System.out.println(i + "윤년");
		          } else if (i % 400 == 0) {
		             System.out.println("==================");
		             System.out.println(i + "400년마다 오는 윤년");
		          } else if (i % 400 != 0 && i % 100 == 0) {
		             System.out.println(i + "100년마다 오는 평년");
		          } else if (i % 4 != 0) {
		             System.out.println(i + "평년");
		          } else {
		             System.out.println("아무내용 없음");
		          }
		      }
	   		}
		}
