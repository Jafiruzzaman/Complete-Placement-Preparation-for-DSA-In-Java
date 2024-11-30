public class Conditionals {
  public static void main(String[] args) {
    System.out.println("Learn about conditionals");
    /*
      * Conditionals in Java:
      1. if-else statement
      2. switch-case statement
      3. ternary operator

     */
    int age = 18;
    if (age >= 18) {
      System.out.println("You are eligible to vote");
    } else {
      System.out.println("You are not eligible to vote");
    }

    int number = 10;
    if (number % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }

    int score = 80;
    String grade = (score >= 90)? "A" : (score >= 80)? "B" : (score >= 70)? "C" : "D";
    System.out.println("Your grade is: " + grade);

    int number1 = 10;
    int number2 = 20;
    int result = (number1 > number2)? number1 : number2;
  }
}
