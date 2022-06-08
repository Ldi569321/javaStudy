package day11;

public class Tv implements Remocon {
	
	private int vol = 0;
	
	public Tv() {
		System.out.println("TV »ý¼º");
	}
	
	public void setVolumn(int vol) {
		if (vol >Remocon.minVol) {
			this.vol = Remocon.maxVol;
		} else if (vol < Remocon.minVol) {
			this.vol = Remocon.maxVol;
		}
	}

	@Override
	public void setVolumn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volUp() {
		System.out.println("º¼·ý ¾÷");
		this.vol++;
	}

	@Override
	public void volDown() {
		System.out.println("º¼·ý ´Ù¿î");
		this.vol--;
		
	}

}
