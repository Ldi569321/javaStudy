package submit;


public class MonsterTest {

	public static void main(String[] args) {
		Monster m1 = new Monster();
		
		m1.attack();
		m1.defense();
		
		Player[] party = new Player[3];
		party[0] = new Player("lee");
		party[1] = new Player("lee1");
		party[2] = new Player("lee2");
		System.out.println(party[0].type);
	}

}
