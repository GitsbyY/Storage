package one.ezen;

public interface Student {

//	public int age = 0; final을 생략했다.
	public static final int age = 30;
	
	public int getAge();
	public void setAge(int age);
	
//	public void info(); abstract를 생략했다.
	public abstract void info();
	
}
