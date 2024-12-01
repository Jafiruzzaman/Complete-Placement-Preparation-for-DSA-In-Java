import java.util.Scanner;

public class CountSum {
  static int countSum(int value) {
    if (value < 0) return -1; // Handle negative numbers
    int sum = 0;
    while (value > 0) {
      sum += value % 10;
      value /= 10;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println("Count sum Problem");
    System.out.println("Enter a number:");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int result = countSum(num);
    System.out.println("The sum of the digits is: " + result);
    scanner.close();
  }
}
