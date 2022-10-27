package HacktoberFest2022;
import java.util.Scanner;
public class Task02 {
  public static void main(String args[]) {
    int row, a, b, space = 1;
    System.out.print("Enter the number of rows you want to print: ");
    Scanner scan = new Scanner(System.in);
    row = scan.nextInt();
    space = row - 1;
    for (b = 1; b <= row; b++) {
      for (a = 1; a <= space; a++) {
        System.out.print(" ");
      }
      space--;
      for (int x = 1; x <= 2 * b - 1; x++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    space = 1;
    for (b = 1; b <= row - 1; b++) {
      for (a = 1; a <= space; a++) {
        System.out.print(" ");
      }
      space++;
      for (a = 1; a <= 2 * (row - b) - 1; a++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}

