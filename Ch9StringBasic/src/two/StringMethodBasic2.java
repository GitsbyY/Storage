package two;

public class StringMethodBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hellow";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');
		System.out.println(idx1);
		System.out.println(idx2);
		
		int idx3 = s.indexOf('e', 0);
		int idx4 = s.indexOf('e', 2);
		System.out.println(idx3);
		System.out.println(idx4);
		
		int idx5 = s.indexOf("He");
		int idx6 = s.indexOf("ow");
		System.out.println(idx5);
		System.out.println(idx6);
		//4
		
		
	}

}
