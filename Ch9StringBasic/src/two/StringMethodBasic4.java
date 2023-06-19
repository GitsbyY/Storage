package two;

public class StringMethodBasic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "java.lang.java";
		int idx1 = s.lastIndexOf('.');
		int idx2 = s.indexOf('.');
		System.out.println(idx1);
		System.out.println(idx2);
		
		int idx3 = s.lastIndexOf("java");
		int idx4 = s.indexOf("java");
		System.out.println(idx3);
		System.out.println(idx4);
		
		String s1 = "Hello";
		int length = s1.length();
		System.out.println(length);
		
		String s2 = "Hello";
		String s3 = s2.replace('o', ' ');
		System.out.println(s2);
		System.out.println(s3);
		
		
		String s4 = s2.replace("ll", "KK");
		System.out.println(s2);
		System.out.println(s4);
	}

}
