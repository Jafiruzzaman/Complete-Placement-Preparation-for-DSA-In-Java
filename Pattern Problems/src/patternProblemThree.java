import java.util.Scanner;

public class patternProblemThree {
  public static void main(String[] args) {
    System.out.println("print 90 Degree star triangle");
    System.out.println("Enter the number of row");
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
//  print the triangle pattern
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}
