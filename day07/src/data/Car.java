package data;

public class Car {
	//인스터스 필드
	int gas;
	
	//정적 필드
	static int oilPrice;
	
	//정적 메소드
	static void setGas(int gas) {
		Car c1 = new Car();
		c1.setSpeed(100);
	}
	
	//인스턴스 메소드
	void setSpeed(int speed) {
		gas = speed;
	}
	

}
