
public class Ch4FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		스위치문(switch)
		
//		if문과 비슷
		
//		 switch (조건식) {
//		case value1:
//			조건식의 결과가 값 1과 같은 경우 수행 될 문장들
//			break;
//		case value2:
//			조건식의 결과가 값 2과 같은 경우 수행 될 문장들
//			break;
//		case value3:
//			조건식의 결과가 값 3과 같은 경우 수행 될 문장들
//			break;
//			,
//			,
//			,
//		default:
//			조건식의 결과와 일치하는 case문이 없을 때 수행 될 문장들
//			break;
//		}
		 
		int levelNum = 0;
		String str = "";
		String lastStr = " 입니다.";
		String finishStr = "";
		//Num or Str이 뒤에 붙는 것.
		levelNum = 2;
		
		switch (levelNum) {
		case 1:
			str = "신입";
			break;//case 1 에 포함이 된다면 다 건너뛴다.
			      //break가 없으면 사원으로 출력된다.
		case 2:
			str = "사원";
			break;
		default:
			str = "경력사원";
			break;
		}
		finishStr = str + lastStr ;
		System.out.println(finishStr);
		
		 
	}

}
