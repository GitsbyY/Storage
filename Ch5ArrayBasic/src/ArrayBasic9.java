
public class ArrayBasic9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 복사?
				//(잘못 생각한 복사 방식의 예)
				
				int[] numArr = {
						1, 2
				};
				int [] newnumArr = new int [2];
				
				newnumArr = numArr;
						
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
