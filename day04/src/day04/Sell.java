package day04;

import data.FishBread;

public class Sell {

	public static void main(String[] args) {
		
		FishBread potbung = new FishBread(1100);
		potbung.flavor = "��";
		
		FishBread shubung = new FishBread(10.1);
		shubung.flavor = "��ũ��";
		System.out.println(shubung.flavor+"��");
		System.out.println(shubung.price+"��");
		System.out.println(shubung.size);

	}

}
