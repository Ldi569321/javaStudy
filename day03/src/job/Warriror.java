package job;

public class Warriror {
	//�ʵ� or ��� ����
	public int hp;
	public int mp;
	
	//����Ʈ ������ (�ۼ� ���� ���� ��� �ڵ� ����)
	public Warriror() {
		System.out.println("���� ��ü�� ����!");
	}
	
	//���� ���Ӱ� �ۼ��� ������
	public Warriror(int hp, int mp) {
		hp = this.hp;
		mp = this.mp;
	}
	
	public void attack() {
		System.out.println("�����߽��ϴ�!");
	}
}
