package HacktoberFest2022;
import java.util.Scanner;
public class Task02 {
  public static void main(String args[]) {
    int row, i, j, space = 1;
    System.out.print("Enter the number of rows you want to print: ");
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
