package by.itacademy.malkova;

import java.util.Scanner;

public class MostFrequentChar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = scanner.nextLine();
        text = text.toLowerCase();
        text = text.replace(" ", "");

        int maxCount = 0;
        char mostFrequentChar = ' ';

        for (int i = 0; i < text.length(); i++) {
            char currantChar = text.charAt(i);
            int currentCharCount = 0;
            for (int j = 0; j < text.length(); j++) {
                if (currantChar == text.charAt(j)) {
                    currentCharCount++;
                }
            }
            if (maxCount < currentCharCount) {
                maxCount = currentCharCount;
                mostFrequentChar = currantChar;
            }
        }
        System.out.println("Most frequent letter is '" + mostFrequentChar + "'");
    }
}
