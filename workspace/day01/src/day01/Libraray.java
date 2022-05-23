package day01;

import data.Book;

public class Libraray {

		public static void main(String[] args) {
			Book littlePrince = new Book();
			littlePrince.title = "어린왕자";
			littlePrince.page = 300;
			littlePrince.price = 12000;
			littlePrince.company = "창비";
			
			System.out.println(littlePrince.title);
			
			Book faust = new Book();
			faust.title = "파우스트";
			
			
		}
}
