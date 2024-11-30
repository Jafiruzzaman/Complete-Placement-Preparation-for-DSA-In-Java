public class forEachLoop {
  public static void main(String[] args) {
    System.out.println("Learn about forEach loop");
    int[] numbers = {1, 2, 3, 4, 5};
//    generate random numbers
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100);
    }
    for (int number : numbers) {
      System.out.println("Number: " + number);
    }
  }
}
