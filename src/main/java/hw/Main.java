package hw;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(final String[] args) {
    int num = 0;

    /* Condition to check the arguments length */

    if (args.length > 0) {
      try {

        /* Parse the string argument into an integer */

        num = Integer.parseInt(args[0]);

        /* If provided argument is < 0 otherwise call the static function from FizzBuzz class */

        if (num < 0) {
          System.err.println("The argument entered cannot a negative integer");
        }
        else {
          FizzBuzz.fizzBuzzList(num);
        }
      }
      catch(NumberFormatException e) {
        System.err.println("The argument entered must be an integer");
        System.exit(1);
      }
    }
    else {
      System.out.println("No command line arguments found");
    }
  }
}