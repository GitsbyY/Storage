package three;

public class TypeChangeBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iVar = 100;
		String strVar = "";
		
		strVar = String.valueOf(iVar);
		
		System.out.println(strVar + 1000);
		
		String strVar2 = "2000";
		int iVar2 = 0;
		
		iVar2 = Integer.parseInt(strVar2);
		
		System.out.println(iVar2 + 1000);
		
		Double doubleVar = 10.12345;
		String doubleStr = String.valueOf(doubleVar);
		
		System.out.println(doubleStr + "100");
		
		
		
	}

}
