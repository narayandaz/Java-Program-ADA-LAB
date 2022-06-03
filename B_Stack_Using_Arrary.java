import java.util.Scanner;

class Stack {
  int top;
  int maxsize = 10;
  int[] arr = new int[maxsize];

  boolean isEmpty() {
    return (top < 0);
  }

  Stack() {
    top = -1;
  }

  boolean push(Scanner sc) {
    if (top == maxsize - 1) {
      System.out.println("Overflow !!");
      return false;
    } else {
      System.out.print("Enter Value: ");
      int val = sc.nextInt();
      top++;
      arr[top] = val;
      System.out.println(" Item pushed ");
      return true;
    }
  }

  boolean pop() {
    if (top == -1) {
      System.out.println("Underflow !!");
      return false;
    } else {
      top--;
      System.out.println("Item popped");
      return true;
    }
  }

  void display() {
    System.out.println("\n********* PRINTING STACK ELEMENTS **********\n");
    for (int i = top; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }
}

public class B_Stack_Using_Arrary {
  public static void main(String[] args) {
    System.out.println("*********Stack operations using array*********\n");
    System.out.println("\n------------------------------------------------\n");
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    Stack s = new Stack();
    while (choice != 4) {
      System.out.println("\nChose one from the below options...");
      System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      switch (choice) {
        case 1: {
          s.push(sc);
          break;
        }
        case 2: {
          s.pop();
          break;
        }
        case 3: {
          s.display();
          break;
        }
        case 4: {
          System.out.println("Exiting....");
          System.exit(0);
          break;
        }
        default: {
          System.out.println("Please Enter valid choice ");
        }
      }
    }
  }
}
