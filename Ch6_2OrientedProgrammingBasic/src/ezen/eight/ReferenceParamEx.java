package ezen.eight;

public class ReferenceParamEx {
	
	
	void change(Data data) {
		
		data.num = 1000;
		
		System.out.println("change() : num = " + data.num);
	}
	
}
