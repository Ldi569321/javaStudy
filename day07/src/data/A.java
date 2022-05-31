package data;

public class A {
	
	//모든 패키지 제한X 
	//public A() {};
	
	//같은 패키지, 자식만 가능O 
	//protected A() {};
	
	//호출X 
	//private A() {};
	
	//동일한 패키지만 가능 
	public A() {};
	
	public int add(int a, int b) {
		return a+b;
	}
}
