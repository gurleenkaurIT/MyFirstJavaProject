package guessingGame;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GuessingGame {
	static int maximumIncorrectLetters = 5;
	String randomName;
	String words = "";
	String letter;
	Scanner sc1 = new Scanner(System.in);

	public void getRandomName() {
		List<String> names = new ArrayList<String>();
		Scanner sc = null;
		try {
			sc = new Scanner(Paths.get("C:\\Users\\Gurleen Kaur\\OneDrive\\Desktop\\nameslist.txt"));

			while (sc.hasNextLine()) {
				String namesList = sc.nextLine();
				names.add(namesList);
			}
			System.out.println(names);
			Collections.shuffle(names);
			randomName = names.get(0);
			System.out.println(randomName);
			for (int i = 0; i < randomName.length(); i++) {
				words += "_";
			}
			System.out.println("You are guessing : " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

	public void guessWordCorrectly() {
		StringBuilder sb = new StringBuilder(words);
		for (int j = 1; j <= maximumIncorrectLetters;) {
			if (words.contains("_")) {
				System.out.println("Guess a letter:");
				letter = sc1.nextLine();
				if (randomName.contains(letter)) {
					for (int i = 0; i < randomName.length(); i++) {
						char ch = randomName.charAt(i);
						if (letter.charAt(0) == ch) {
							sb.setCharAt(i, ch);
						}
					}
					words = sb.toString();
					System.out.println("You are guessing : " + words);
				} else {
					System.out.println("You have guessed incorrect letter " + j + " times");
					j++;
					if (j == 6) {
						System.out.println("You lose. Game Over");
						break;
					}
				}
			} else {
				System.out.println("You have Guessed the word " + words + " correctly");
				System.out.println("You Win!!");
				break;
			}
		}
	}
}
