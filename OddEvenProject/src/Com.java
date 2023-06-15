
public class Com {
	//숫자 하나를 가지고 있다.num
	int num = 0;
	
	int setRandomNum() {
		num = (int)(Math.random()* 99) + 1;
		return  num;
	}
}
