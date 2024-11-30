import java.util.Scanner;

public class InputsInJava {
  public static void main(String[] args) {
    System.out.println("InputsInJava");
    /*
      * Java provides several ways to take user input.
      1. Scanner class: Scanner is a class that provides methods for reading values from the user.
      2. System.in: System.in is a standard input stream in Java.
      3. BufferedReader: BufferedReader reads characters from a character-input stream, buffering characters so that methods do not have to read a character at a time.
      4. Scanner.nextLine(): This method reads the next line of text from the input stream.
     */
    Scanner scanner = new Scanner(System.in);

//  for byte
    System.out.println("Enter a number from -128 to 127 : ");
    byte numberByte = scanner.nextByte();
    System.out.println("the byte value is : "+numberByte);

//  for short
    System.out.println("Enter a number from -32000 to 32000 : ");
    short numberShort = scanner.nextShort();
    System.out.println("the short value is : "+numberShort);
//  for int
    System.out.println("Enter a number : ");
    int numberInt = scanner.nextInt();
    System.out.println("the int value is : "+numberInt);
//  for float
    System.out.println("Enter a number of smaller Decimal : ");
    float numberFloat = scanner.nextFloat();
    System.out.println("the float value is : "+numberFloat);
//  for double
    System.out.println("Enter a number of bigger Decimal : ");
    double numberDouble = scanner.nextDouble();
    System.out.println("the double value is : "+numberDouble);
//  for char
    System.out.println("Enter only single character");
    char charValue = scanner.next().charAt(0);
    System.out.println("The single character is "+charValue);
//  for first single word
    System.out.println("Enter the word : ");
    String firstWord = scanner.next();
    System.out.println("The first word is "+firstWord);
    scanner.nextLine();
//  for whole sentence
    System.out.println("Enter the whole sentence : ");
    String wholeSentence = scanner.nextLine();
    System.out.println("The whole sentence is "+wholeSentence);
    scanner.close();
  }
}
