import java.util.Scanner;

/*
 * 
 * Task: Write a short program that prints each number from 1 to n on a new
 * line.
 * 
 * The user should put in the value of n (between 10 and 100).
 * 
 * For each multiple of 3, print "Fizz" instead of the number.
 * 
 * For each multiple of 5, print "Buzz" instead of the number.
 * 
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of
 * the number.
 * 
 */

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		System.out.println("Enter a number from 10-100:");

		while (!scanner.hasNextInt()) {
			System.out.println("Invalid input. Please enter a valid number from 10-100:");
			scanner.next();
		}

		n = scanner.nextInt();

		while (n < 10 || n > 100) {
			System.out.println("Invalid number. Enter a number from 10-100:");
			n = scanner.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
