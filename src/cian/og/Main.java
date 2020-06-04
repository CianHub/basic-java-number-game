package cian.og;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	    int firstNumber = 2;
	    int secondNumber = 5;

	    var subtraction = 6;
	    int answer;

	    String prompt = ". Press ENTER when ready.";

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

	    scanner.close();

    }
}
