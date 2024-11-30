import java.util.Scanner;

// ? Problem Link Leetcode: https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
public class problemOne {
  static int countDigits(int value) {
    if(value<0) return -1;
    int count = 0;
    while (value>0){
      int digit = value %10;
      count++;
      value /= 10;
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println("solve count digit problem ");
    System.out.println("Enter the number");
    Scanner scanner = new Scanner(System.in);
    int digit = scanner.nextInt();
    int count = countDigits(digit);
    System.out.println("the count of the digit is "+count);
    scanner.close();
  }
}
