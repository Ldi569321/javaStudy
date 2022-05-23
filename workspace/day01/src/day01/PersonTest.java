package day01;

import data.PersonVO;

public class PersonTest {

	public static void main(String[] args) {
		PersonVO leedongin = new PersonVO();
		leedongin.name = "이동인";
		leedongin.height = 171.6;
		leedongin.gender = "남자";
		leedongin.age = 17;
		
		System.out.println("이름: "+leedongin.name);
		System.out.println("키: "+leedongin.height);
		System.out.println("성별: "+leedongin.gender);
		System.out.println("나이: "+leedongin.age);

	}

}
