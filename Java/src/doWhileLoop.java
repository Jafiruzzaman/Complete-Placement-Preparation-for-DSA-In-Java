public class doWhileLoop {
  public static void main(String[] args) {
    System.out.println("learn about doWhileLoop");
    // ! do-while loop executes the code block at least once, then checks the condition
    int count = 12;
    do {
      System.out.println("Count: " + count);
      count++;
    } while (count < 10);
  }
}
