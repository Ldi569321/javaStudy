package data;

public class FishBread {
	//�ʵ�
	public String flavor;
	public int price;
	public double size;
	
	//������
	public FishBread(int price) {
		this.price = price;
	}
	
	//�����ε�
	public FishBread() {
		this.price = 1000;
		this.size = 10.0;
	}
	
	public FishBread(double size) {
		this.size = size;
	}
	
	//�޼ҵ�
	public void sayFlavor() {
		System.out.println(this.flavor);
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public int showPrice() {
		return price;
	}
	
	public double sizing(double size) {
		this.size = size;
		return size;
	}
	
}
