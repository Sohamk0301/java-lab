package com.deloitte.lab03.ex05;

import java.util.Scanner;

public class TextCal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder text = new StringBuilder();

		System.out.println("Enter text (type 'exit' to finish):");

		while (true) {
			String line = scanner.nextLine();
			if (line.equalsIgnoreCase("exit")) {
				break;
			}
			text.append(line).append("\n");
		}

		String inputText = text.toString();

		int characterCount = inputText.length();

		int lineCount;
		if (inputText.isEmpty()) {
			lineCount = 0;
		} else {
			lineCount = inputText.split("\n").length;
		}

		int wordCount;
		if (inputText.isEmpty()) {
			wordCount = 0;
		} else {
			wordCount = inputText.trim().split("\\s+").length;
		}

		System.out.println("no. of characters: " + characterCount);
		System.out.println("no. of lines: " + lineCount);
		System.out.println("no. of words: " + wordCount);

		scanner.close();
	}
}
