package day04;

import data.FishBread;

public class Sell {

	public static void main(String[] args) {
		
		FishBread potbung = new FishBread(1100);
		potbung.flavor = "ÆÏ";
		
		FishBread shubung = new FishBread(10.1);
		shubung.flavor = "½´Å©¸²";
		System.out.println(shubung.flavor+"¸À");
		System.out.println(shubung.price+"¿ø");
		System.out.println(shubung.size);

	}

}
