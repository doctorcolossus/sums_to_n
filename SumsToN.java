/* CS 4050: Algorithms & Algorithm Analysis
 * Project 1: Sums to N problem
 * Casey Jones
 * Bradley Isaacs
 * Ahmadwali Zadron
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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

  }

  public static void findSums (int n) {

    findSums(n, new ArrayList<Integer>());
    System.out.println(Integer.toString(n));

  }

  public static void findSums (int n, ArrayList<Integer> addends) {

    ArrayList<Integer> addendArgs;
    String output = "";
    int last = 0;

    if (n == 1)
      System.out.println("1");

    else {

      for (int i = 1; i <= n / 2; i++) {

        addendArgs = new ArrayList<>(addends);

        int j = n - i;

        if (!addends.isEmpty())
          last = addends.get(addends.size() - 1);

        if (i >= last) {

          if (j > i) {
            addendArgs.add(i);
            findSums(j, addendArgs);
          }

          if (j >= i) {

            for(Integer addend : addends)
              System.out.printf(Integer.toString(addend) + "+");

            System.out.println(Integer.toString(i) + "+"
                               + Integer.toString(j));

          }

        }

      }

    }

  }

}
