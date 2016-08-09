package com.zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {

		ArrayList<Animals>myZoo = new ArrayList<>();

		Primates chimp = new Primates("Chimpanzee", 2, 12, "Rodger", true, 10, "omnivore", true, true);
		Primates orangutan = new Primates("Orangutan",2, 23, "Steve", true, 2, "Herbivore", true, true);
		Primates gorilla = new Primates("Gorilla", 2, 14, "hercules", true, 6, "herbivore", true, true);
		Primates baboon = new Primates("Baboon", 2, 4, "Billy", true, 10, "omnivore", true, true);

		Reptiles snake = new Reptiles("Snake", 0, 5, "Slither", false, 1, "carnivore", true, 3, "Desert");
		Reptiles lizard = new Reptiles("Lizard", 4, 2, "George", false, 1, "carnivore", false, 3, "Rain Forest");
		Reptiles turtle = new Reptiles("Turtle", 4, 30, "Cal", false, 4, "omnivore", true, 5, "Wet Lands");

		BigCats lion = new BigCats("Lion", 4, 6, "Simba", true, 8, "carnivore", "Pack Hunting", "Pride", "solid");
		BigCats tiger = new BigCats("Tiger", 4, 4, "Shirkhan", true, 1, "carnivore", "Lone Stalker", "Loner", "striped");
		BigCats cheetah = new BigCats("Cheetah", 4, 5, "Speedy", true, 2, "carnivore", "Stalker", "Loner", "Spotted");

		myZoo.add(chimp);
		myZoo.add(orangutan);
		myZoo.add(gorilla);
		myZoo.add(baboon);
		myZoo.add(snake);
		myZoo.add(lizard);
		myZoo.add(turtle);
		myZoo.add(lion);
		myZoo.add(tiger);
		myZoo.add(cheetah);

		System.out.println("Today at the zoo I saw the folllowing animals: \n");
		System.out.println();
		System.out.println(myZoo);
		
		for (int i = 0; i < myZoo.size(); i++) {
			
			System.out.println(myZoo.get(i));

		}


	}

}
