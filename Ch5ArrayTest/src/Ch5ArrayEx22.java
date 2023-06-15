
public class Ch5ArrayEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열의 복사 방법
		
		int[] numArr = {
				1, 2
		};
		int [] newnumArr = new int [2];
		
		for (int i = 0; i < newnumArr.length; i++) {
		newnumArr[i] = numArr[i];
		}
				
		System.out.println("========원본내용=======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		System.out.println("========복사내용=======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(newnumArr[i]);
		}
		
		newnumArr[0] = 999;
		
		System.out.println("========원본내용=======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		System.out.println("========복사내용=======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(newnumArr[i]);
		}
		
	
     
        
	}

}
