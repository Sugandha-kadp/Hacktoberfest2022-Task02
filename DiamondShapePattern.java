//Fix the errors
package HacktoberFest2022;
//import scanner class
import java.util.Scanner;
//Tasks calss
public class Task02 {
  //main class
  public static void main(String args[]) {
    int row, i, j, space = 1;
//display to get input
    System.out.print("Enter the number of rows you want to print: ");
//get input
    Scanner scan = new Scanner(System.in);

    row = scan.nextInt();

    space = row - 1;

    for (j = 1; j <= row; j++) {
      for (i = 1; i <= space; i++) {
        System.out.print(" ");
      }
      space--;

      for (a = 1; a <= 2 * j - 1; a++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    space = 1;

    for (j = 1; j <= row - 1; j++) {
      for (i = 1; i <= space; i++) {
        System.out.print(" ");
      }

      space++;

      for (i = 1; i <= 2 * (row - j) - 1; i++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
