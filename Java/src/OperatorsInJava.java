public class OperatorsInJava {
  public static void main(String[] args) {
    System.out.println("Operators in java");

//  1. Assignment Operator
//  2. Arithmetic Operator
//  3. Relational Operator
//  4. Logical Operator
//  5. Bitwise Operator
//  6. Ternary Operator

//  1. Assignment Operator (=,+=,-=,*=,/=)
//  equals(=)
//    Here user assign a value which is 10 assigned in a. Now it means a's value is 10
    int a = 10;

//  plus equals(+=)
    a +=10;
    System.out.println(a);
//    It means now a's value is 20
//  Minus equals(=)
    System.out.println(a);
//    It means now a's value is become 10
    a -=10;
    System.out.println(a);
//  Multiply equals(*=)
    a*=5;
    System.out.println(a);
//  Divide equals(/=)
    a/=10;
    System.out.println(a);

//  2. Arithmetic Operator
    int numOne = 11;
    int numTwo = 5;
//  plus(+)
    System.out.println("The sum of 10 + 5 is "+(numOne+numTwo));
//  minus(-)
    System.out.println("The sum of 10 - 5 is "+(numOne-numTwo));
//  multiply(*)
    System.out.println("The sum of 10 * 5 is "+(numOne*numTwo));
//  divide(/)
    System.out.println("The sum of 10 / 5 is "+(numOne/numTwo));
//  modulo(%)
    System.out.println("The sum of 10 % 5 is "+(numOne%numTwo));

//  * 3. Relational Operator
//  greater than (>)
    System.out.println("is 11 > 5 is it "+(11>5));
//  greater than or equals (>=)
    System.out.println("is 11 >= 5 is it "+(11>=5));
//  less than (<)
    System.out.println("is 11 < 5 is it "+(11<5));
//  less than or equals (<=)
    System.out.println("is 11 <= 5 is it "+(11<=5));
//  is equals to (==)
    System.out.println("is 11 == 5 is it "+(11==5));
//  not equals to (!=)
    System.out.println("is 11 != 5 is it "+(11!=5));

//  * 4. Logical Operator
//  And Operator(&&)
    System.out.println("is 11 > 5 and 11 == 5 is it "+(11 > 5 && 11==5));
//  Or Operator(||)
    System.out.println("is 11 > 5 and 11 == 5 is it "+(11 != 5 || 11>=5));
//  ! Not Operator(!) Not Operator Convert true to false and false to true
    boolean isEatable = false;
    System.out.println("Not Operator convert "+isEatable+" into "+(!isEatable));
//  * 5. Bitwise Operator
//  bitwise and(&)
    int intOne = 7;
    int intTwo = 5;
    System.out.println("the result of 7 & 5 is "+(7&5));
//  bitwise or(|)
    System.out.println("the result of 7 | 5 is "+(7|5));
//  bitwise xor(^)
    System.out.println("the result of 7 ^ 5 is "+(7^5));
//  bitwise not(~)
    System.out.println("the result of ~5 is "+(~intTwo));

//  * 6. Ternary Operators
    int personOne = 18;
    int personTwo = 15;
    String result = (personOne > personTwo) ? "Person one is bigger than person two" : "Person two is bigger than person one";
    System.out.println(result);
}
}
