package day01;

import data.PersonVO;

public class PersonTest {

	public static void main(String[] args) {
		PersonVO leedongin = new PersonVO();
		leedongin.name = "�̵���";
		leedongin.height = 171.6;
		leedongin.gender = "����";
		leedongin.age = 17;
		
		System.out.println("�̸�: "+leedongin.name);
		System.out.println("Ű: "+leedongin.height);
		System.out.println("����: "+leedongin.gender);
		System.out.println("����: "+leedongin.age);

	}

}
