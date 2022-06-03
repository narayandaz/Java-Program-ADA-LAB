import java.util.Scanner;

public class A_DivZeroExpetion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st Number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd Number: ");
    int b = sc.nextInt();
    try {
      int result = a/b;
      System.out.println("Result: "+result);
    } catch (ArithmeticException e) {
      System.out.println("Exception Caught: Divide by zero is not possiable!!");
    }
  }
}
