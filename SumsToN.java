/* CS 4050: Algorithms & Algorithm Analysis
 * Project 1: Sums to N problem
 * Casey Jones
 * Bradley Isaacs
 * Ahadwali Zadron
 */

import java.util.Scanner;

public class SumsToN {

  public static void main (String [] args) {

    Scanner console = new Scanner(System.in);
    int n;

    System.out.print("value of n: ");

    n = console.nextInt();

    if (n < 1) {
      System.out.println("error: n must be positive.");
      System.exit(1);
    }

    findSums(n);

    System.out.printf("%n");

  }

  public static void findSums (int n) {

    if (n > 0) {

      if (n == 1)
        System.out.printf("1");

      else {

        System.out.printf("1+");

        findSums(n - 1);

        System.out.printf("1+");

        System.out.printf(Integer.toString(n));

        System.out.printf(", ");

      }

    }

  }

}
