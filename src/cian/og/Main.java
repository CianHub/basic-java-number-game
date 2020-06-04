package cian.og;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGen = new Random();

	    int firstNumber = randomGen.nextInt(8) + 2;
	    int secondNumber = randomGen.nextInt(8) + 2;

	    var subtraction = randomGen.nextInt(8) + 2;
	    int answer;

	    String prompt = ". Don't type the answer just press ENTER when ready.";

	    System.out.println("Think of a number between 1 and 10" + prompt);
	    scanner.nextLine();
        System.out.println("Multiply a number by " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("Now multiply the result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Now divide the result by the original number" + prompt);
        scanner.nextLine();
        System.out.println("Now subtract " + subtraction + prompt);
        scanner.nextLine();

        answer = firstNumber * secondNumber - subtraction;
        System.out.println("The answer is " + answer);

	    scanner.close();

    }
}
