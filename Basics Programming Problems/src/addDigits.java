import java.util.Scanner;

public class addDigits {
  static int addDigits(int num){
    int totalSum = 0;
    while (num>9){
      // reset total sum for each iteration
      totalSum = 0;
      while(num!=0){
        totalSum+= num % 10;
        num /= 10;
      }
      num = totalSum;
    }
    return totalSum;
  }
  public static void main(String[] args) {
    System.out.println("solve add digit problem");
    System.out.println("Enter the number");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int sum = addDigits(num);
    System.out.println("the sum of the digits is "+sum);
  }
}
