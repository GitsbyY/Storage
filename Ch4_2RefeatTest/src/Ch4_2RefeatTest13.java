public class Ch4_2RefeatTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		*
//		**
//		***
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i = 3; i >=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int a = 0; a < 1; a++ ) {
			System.out.println("*");
			for(int b = 0; b < 1; b++) {
				System.out.println("**");
			}for(int b = 0; b < 1; b++) {
			System.out.println("***");}
		}

	}// main
}// class
