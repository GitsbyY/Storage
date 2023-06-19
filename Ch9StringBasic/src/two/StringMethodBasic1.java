package two;

public class StringMethodBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Hello");
		System.out.println(s);
		
		char[] c = {'H','e','l','l','o'};
		String s1 = new String(c);
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String(sb);
		System.out.println(s2);
		//1
		
		char ch = s.charAt(0);
		System.out.println(ch);
		//2
		
		String s3 = "Hellow";
		boolean b = s3.contains("He");
		System.out.println(b);
		boolean b1 = s3.endsWith("ow");
		System.out.println(b1);
		boolean b3 = s3.equals("Hellow");
		System.out.println(b3);
		boolean b4 = s3.equals("hellow");
		System.out.println(b4);
		boolean b5 = s3.equalsIgnoreCase("Hellow");
		System.out.println(b5);
		boolean b6 = s3.equalsIgnoreCase("hEllow");
		System.out.println(b6);
		//3
		
	}

}
