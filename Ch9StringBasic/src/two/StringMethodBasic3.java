package two;

public class StringMethodBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AABBAABB";
		String r = s.replaceAll("BB", "bb");
		System.out.println(s);
		System.out.println(r);
		String sr = s.replaceFirst("BB", "bb");
		System.out.println(sr);
		//5
		
		String animals = "dog,cat,bear";
		String [] arr = animals.split(",");
		String [] arr1 = animals.split(",",2);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		//6
		
		String s1 = "java.lang.java";
		boolean b1 = s1.startsWith("java");
		boolean b2 = s1.startsWith("lang");
		System.out.println(b1);
		System.out.println(b2);
		
		String c = s1.substring(10);
		String p = s1.substring(5,9);
		System.out.println(c);
		System.out.println(p);
		
		
	}

}
