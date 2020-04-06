package com.qa.main;

public class DiceRolls {
	double roll(int rolls, int diceSide) {
		double sum = 0;
		int halfMin = 0;
		halfMin = diceSide / 2 + 1;
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < rolls; j++) {
				int random = (int) (Math.random() * (diceSide));
				if (random < halfMin) {
					random = halfMin;
				}
				sum += random + 1;
			}
		}
		sum /= 100000;
		return sum;
	}
}
