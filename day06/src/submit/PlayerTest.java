package submit;

public class PlayerTest {

	public static void main(String[] args) {
		// Player p0 = new Player("player0");
		// Player p1 = new Player("player1");
		// Player p2 = new Player("player2");
		
		
		Player[] party = new Player[3];
		
		for (int i = 0; i < party.length; i++) {
			party[i] = new Player("player"+(i));
		}
		
		party[0].attack(party[1]);
		party[0].defense();
		System.out.println("----------");		
		Player yeji = new Player("yeji");
		Player jihye = new Player("jihye");
		
		yeji.attack(jihye);
		jihye.attack(yeji);
		yeji.defense();
	}

}
