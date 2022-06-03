import java.util.Scanner;
class Student {
  private String usn, name, branch, phone;

  public Student(String usn, String name, String branch, String phone) {
    super();
    this.usn = usn;
    this.name = name;
    this.branch = branch;
    this.phone = phone;
  }
  @Override
  public String toString() {
    return "\nUSN: " + usn + "\nNAME: " + name + "\nBRANCH: " + branch
        + "\nPHONE NUMBER: " + phone ;
  }
}
public class A_StudentData {
  public static void main(String args[]) {
    int i;
    String usn, branch, name, phone;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of Students: ");
    int n = s.nextInt();
    Student[] students = new Student[n + 1];
    for (i = 1; i <= n; i++) {
      System.out.println("Enter student " + i + " details\n");
      System.out.print("USN: ");
      usn = s.next();
      System.out.print("Name: ");
      name = s.next();
      System.out.print("Branch: ");
      branch = s.next();
      System.out.print("Phone: ");
      phone = s.next();
      students[i] = new Student(usn, name, branch, phone);
    }
    System.out.println("\n+++++++Student Details++++++++");
    for (i = 1; i <= n; i++) {
      System.out.println(students[i]);
    }
  }
}
