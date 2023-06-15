package gradePractic;

public class Student {
	String name;
	int math;
	int english;
	int korean;
	
	public Student(String name,int math,int english,int korean){
		this.name = name;
		this.math=math;
		this.english=english;
		this.korean=korean;
	}
	
	public double Sum(){
		return math+korean+english;
	}
	public double Average(){
	
		return (int)((math+korean+english)*1000 + 0.5)/3000.0;
	}
}
