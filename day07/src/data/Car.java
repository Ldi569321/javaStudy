package data;

public class Car {
	//�ν��ͽ� �ʵ�
	int gas;
	
	//���� �ʵ�
	static int oilPrice;
	
	//���� �޼ҵ�
	static void setGas(int gas) {
		Car c1 = new Car();
		c1.setSpeed(100);
	}
	
	//�ν��Ͻ� �޼ҵ�
	void setSpeed(int speed) {
		gas = speed;
	}
	

}
