package hw;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  private Main fixture;

  public static void fizzbuzz(int num) {
    for (int i=1; i<num; i++) {
      if ((i%3 == 0) && (i%5 == 0)) {
        System.out.println("fizz buzz");
      } else if (i%3 == 0) {
        System.out.println("fizz");
      } else if (i%5 == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(i);
      }
    }
  }

  /* fizzbuzz function which will return the output in a string array */

  public static String[] fizzBuzz(final int n) {

    String[] fizzbuzzArr;

    if (n <= 0) {
      fizzbuzzArr = new String[1];
      fizzbuzzArr[0] = "You must enter a positive integer > 0";
    }
    else {
      fizzbuzzArr = new String[n-1];

      for (int i=1; i<n; i++) {
        if ((i%3 == 0) && (i%5 == 0)) {
          fizzbuzzArr[i-1] = "fizz buzz";
        } else if (i%3 == 0) {
          fizzbuzzArr[i-1] = "fizz";
        } else if (i%5 == 0) {
          fizzbuzzArr[i-1] = "buzz";
        } else {
          fizzbuzzArr[i-1] = String.valueOf(i);
        }
      }
    }

    return fizzbuzzArr;

  }

  /* fizzbuzz function to return the output in a List of string */

  public static List<String> fizzBuzzList(final int n) {

    List<String> fizzbuzzArr = new ArrayList<String>();

    if (n <= 0) {
      fizzbuzzArr.add("You must enter a positive integer > 0");
    }
    else {
      for (int i=1; i<n; i++) {
        if ((i%3 == 0) && (i%5 == 0)) {
          fizzbuzzArr.add("fizz buzz");
        } else if (i%3 == 0) {
          fizzbuzzArr.add("fizz");
        } else if (i%5 == 0) {
          fizzbuzzArr.add("buzz");
        } else {
          fizzbuzzArr.add(String.valueOf(i));
        }
      }
    }

    return fizzbuzzArr;

  }
}

