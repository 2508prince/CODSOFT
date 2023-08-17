package Codsoft_Internship;

import java.util.Scanner;

public class First_task {
        public static void Number_Game() {
            Scanner sc = new Scanner(System.in);

            // Generate the Random numbers
            int number = 1 + (int) (100 * Math.random());

            // Given K trials
            int K = 5;

            System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

            // Iterate over K Trials
            int i;
            for (i = 0; i < K; i++) {

                System.out.println("Guess the number:");

                // Take input for guessing the number
                int guess = sc.nextInt();

                // If the number is guessed
                if (number == guess) {
                    System.out.println("Congratulations! You guessed the number.");
                    break;

                } else if (number > guess && i != K - 1) {
                    System.out.println( "The number is " + "greater than " + guess);

                } else if (number < guess   && i != K - 1) {
                    System.out.println( "The number is" + " less than " + guess);
                }
            }
            if (i == K) {
                System.out.println( "Your limit os over of K trials.");

                System.out.println( "The number was " + number);
            }
        }
        public static void main(String arg[])
        {
            Number_Game();
        }
    }

