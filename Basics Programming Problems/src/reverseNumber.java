import java.util.Scanner;

public class reverseNumber {
  static int reverseNumbers(int num){
    int reversedNum = 0;
    while(num!=0){
      reversedNum = reversedNum * 10 + num % 10;
      num = num / 10;
    }
    return reversedNum;
  }
  public static void main(String[] args) {
    System.out.println("reverse a number");
    System.out.println("Enter a number");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int reversedNum = reverseNumbers(num);
    System.out.println("the reverse number is " + reversedNum);
    scanner.close();
  }
}
