package creature;



public class Kevin extends Human
implements Programmer, Swimable{

	public Kevin(int x, int y, int age) {
		super(x, y, age);
	}
	
	@Override
	public void swimDown(int y) {
		this.y = this.y - y; 
		System.out.println("수심 " + this.y + "미터에서 수영중입니다.");
		if(this.y<-20) {
			System.out.println("수심 -20미터 아래로 내려가 사망하였습니다.");
		}
	}
	
	@Override
	public void coding() {
		System.out.println("코딩 언어 " + Programmer.LANG + "를 할수있습니다.");
	}
	
	
	
}
