import java.util.Scanner;

public class leapYear {
  static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 !=0) return true;
    else if (year %400==0) return true;
    return false;
  }
  public static void main(String[] args) {
    System.out.println("leap year problem");
    System.out.println("Enter a year");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    boolean result = isLeapYear(year);
    System.out.println("the year is " + year+" is a leap year is it "+result);
    sc.close();
  }
}
