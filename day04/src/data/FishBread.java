package data;

public class FishBread {
	//필드
	public String flavor;
	public int price;
	public double size;
	
	//생성자
	public FishBread(int price) {
		this.price = price;
	}
	
	//오버로딩
	public FishBread() {
		this.price = 1000;
		this.size = 10.0;
	}
	
	public FishBread(double size) {
		this.size = size;
	}
	
	//메소드
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
