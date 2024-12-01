import java.util.Scanner;

public class patternProblem {
  public static void main(String[] args) {
    System.out.println("print a start rectangle");
    System.out.println("Enter the number of row");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    System.out.println("Enter the number of column");
    int col = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
