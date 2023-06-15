
public class BimProjectTest {
	public static void main(String[] args) {
		BimProject bi = new BimProject();
		bi.productName = "삼성";
		bi.manufDate = "2022-12-20";
		bi.volume = 19;
		bi.power = false;

		// ()괄호가 들어가면 메서드
		bi.power();
		bi.volumeUp();
		bi.volumeDown();
		bi.product();
		
	}
}
