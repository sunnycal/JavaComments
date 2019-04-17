package com.company;

/*
 * Comments Example Program
 * Milana Campbell
 * April 17, 2019
 */
import java.util.Random;
import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
      {
     Scanner scan = new Scanner(System.in);

     //
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = random.nextInt((int)(to - from + 1)) + (int)from;

        //notice the data types of the variables declared so far
          // (int) is an explicit cast that will convert a 'long' data type to an 'int' data type

          //
        int guessedNumber = 0;

        //
        System.out.printf("The number is between %d and %d. \n", from, to);

        //
        do
            {

            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);

            }

    }

