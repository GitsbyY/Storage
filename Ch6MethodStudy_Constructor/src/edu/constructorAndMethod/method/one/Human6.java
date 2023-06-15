package edu.constructorAndMethod.method.one;

public class Human6 {

	String name = "";
    int age = 0;
    double weight = 0;
    //String buildingName = "";
    
    
    void goBuilding(String buildingName) {
    
     
      String str = "";
      
      str = name + " " + buildingName + " 에 간다";

      System.out.println(str);
   }
    
    
   
    void myInfoView() {
	   	  
	      String humanInfoStr = "";
	      String title = "";
	      
	      title = "나의 정보";
	      
	      System.out.println("==========");
	      System.out.println(title);
	      
	      humanInfoStr = "이름 :" + name;
	      System.out.println(humanInfoStr);
	      
	      humanInfoStr = "나이 :" + age;
	      System.out.println(humanInfoStr);
	      
	      humanInfoStr = "몸무게 :" + weight;
	      System.out.println(humanInfoStr);
	      
	      System.out.println("==========");
   }
   
}