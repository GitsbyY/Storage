public class Ch4FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//랜덤에 대하여
		int com = 0;
		
		double num = 0;
		
		num = Math.random();
		      //매쓰 랜덤이라는 메서드를 호출 했다.
			  //임의의 값을 반환한다.
			  //매쓰 랜덤에는 범위가 있다. (0.0 <= 범위 < 1.0)
		System.out.println(num);
				
//		[95~100] 100-95+1
//		주사위
		com = (int)(Math.random() * 6) + 1 ; //공식입니다. -> 3을 곱하면 절대 3이 안나온다. 2까지.
//		              정수화 난수                      범위   시작위치      
		System.out.println("COM은" + com + "입니다");	
		
		

		 
	}

}
