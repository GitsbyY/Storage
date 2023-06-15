
public class Ch5ArrayEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		이름 3개를
//		다른 배열에 복제하고
//		마지막 사람 이름 본인이름 변경
		
		String[] strArr = {
				"임찬우", "손진원", "조남용"
		};
		String[] nameArr = new String[3];
		
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = strArr[i];
		}
				
		System.out.println("원본 이름");
		for (int i = 0; i < 3; i++) {
			if(i!=2) {
				System.out.print(strArr[i]+ " ");
			}else {
				System.out.print(strArr[i]);
			}
		}
		
		System.out.println();
		nameArr[2] = "유효준";
		System.out.println();
		
		System.out.println("복제된 이름" );
//		for (int i = 0; i < strArr.length; i++) {
			//System.out.print(nameArr[i] + " ");
			System.out.print(nameArr[0] + " ");
			System.out.print(nameArr[1] + " ");
			System.out.print(nameArr[2]);
//		}
		
     
	
     
        
	}

}
