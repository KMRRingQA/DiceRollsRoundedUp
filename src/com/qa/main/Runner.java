package com.qa.main;

public class Runner {
	public static void main(String[] Args) {
		DiceRolls roll = new DiceRolls();
		System.out.println(roll.roll(1, 6));
	}
}
