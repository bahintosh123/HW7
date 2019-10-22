package com.company;

public class Main {

    public static void main(String[] args) {
		Male male = new Male();
		male.say1();
		male.say2();
		male.run();
		male.walk();

		male.setName("Bobby");
		male.setSkinColor("Black");
		male.setHairColor("Blond");


		Female female = new Female();
		female.say1();
		female.say2();
		female.run();
		female.walk();

		female.setName("Lilly");
		female.setSkinColor("White");
		female.setHairColor("Red");
		printInfo(female);

		Human arr[] = {new Male(), new Female()};
		for (int i = 0; i < arr.length; i++) {
			arr[i].say1();
			arr[i].say2();
		}

	}
	public static void printInfo(Human human) {
		System.out.println("Info");

			System.out.println(human.getName() + " " + human.getHairColor() + " "+ human.getSkinColor());

		}
}
