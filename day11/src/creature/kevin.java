package creature;



public class Kevin extends Human
implements Programmer, Swimable{

	public Kevin(int x, int y, int age) {
		super(x, y, age);
	}
	
	@Override
	public void swimDown(int y) {
		this.y = this.y - y; 
		System.out.println("���� " + this.y + "���Ϳ��� �������Դϴ�.");
		if(this.y<-20) {
			System.out.println("���� -20���� �Ʒ��� ������ ����Ͽ����ϴ�.");
		}
	}
	
	@Override
	public void coding() {
		System.out.println("�ڵ� ��� " + Programmer.LANG + "�� �Ҽ��ֽ��ϴ�.");
	}
	
	
	
}
