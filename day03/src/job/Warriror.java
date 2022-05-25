package job;

public class Warriror {
	//필드 or 멤버 변수
	public int hp;
	public int mp;
	
	//디폴트 생성자 (작성 하지 않은 경우 자동 생성)
	public Warriror() {
		System.out.println("전사 객체가 생성!");
	}
	
	//내가 새롭게 작성한 생성자
	public Warriror(int hp, int mp) {
		hp = this.hp;
		mp = this.mp;
	}
	
	public void attack() {
		System.out.println("공격했습니다!");
	}
}
