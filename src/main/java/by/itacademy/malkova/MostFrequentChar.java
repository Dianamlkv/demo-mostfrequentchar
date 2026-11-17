package by.itacademy.malkova;

import java.util.Scanner;

public class MostFrequentChar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String testedString = scanner.nextLine();
        testedString = testedString.toLowerCase();
        testedString = testedString.replace(" ", "");

        int maxCount = 0;
        char mostFrequentChar = ' ';

        for (int i = 0; i < testedString.length(); i++) {
            char currantChar = testedString.charAt(i);
            int currentCharCount = 0;
            for (int j = 0; j < testedString.length(); j++) {
                if (currantChar == testedString.charAt(j)) {
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
