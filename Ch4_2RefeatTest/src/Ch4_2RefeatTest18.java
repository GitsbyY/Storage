public class Ch4_2RefeatTest18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		***
//		***
//		***
		for(int i = 1; i <4; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 4; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}// main
}// class
