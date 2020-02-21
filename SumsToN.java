/* CS 4050: Algorithms & Algorithm Analysis
 * Project 1: Sums to N problem
 * Casey Jones
 * Bradley Isaacs
 * Ahmadwali Zadron
 */

import java.util.Scanner;
import java.util.Collections;
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

    System.out.printf(findSums(n));

  }

  public static String findSums (int n) {

    return findSums(n, new ArrayList<Integer>());

  }

  public static String findSums (int n, ArrayList<Integer> addends) {

    ArrayList<Integer> addendArgs;
    String output = "";
    int max = 0;

    if (n == 1)
      return "1,";

    else {

      for (int i = 1; i <= n / 2; i++) {

        addendArgs = new ArrayList<>(addends);

        int j = n - i;

        if (!addends.isEmpty())
          max = Collections.max(addends);

        if (j > i && j > max) {
          addendArgs.add(i);
          output += findSums(j, addendArgs);
        }

        if (j >= i && i >= max) {

          for(Integer addend : addends)
            output += Integer.toString(addend) + "+";

          output += Integer.toString(i) + "+"
                  + Integer.toString(j)
                  + "%n";

        }

      }

      return output;

    }

  }

}
