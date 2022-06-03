import java.util.Scanner;

class Staff {
  protected String staffId, name, ph;
  protected float salary;

  public Staff(String staffId, String name, float salary2, String ph) {
    super();
    this.staffId = staffId;
    this.name = name;
    this.salary = salary2;
    this.ph = ph;
  }

  @Override
  public String toString() {
    return "StaffId: " + staffId + "\nName: " + name + "\nSalary: "
        + salary + "\nPhone: " + ph + "\n";
  }
}

class Teaching extends Staff {
  private String domian, publication;

  public Teaching(String staffId, String name, float salary, String ph,
      String domian, String publication) {
    super(staffId, name, salary, ph);
    this.domian = domian;
    this.publication = publication;
  }

  @Override
  public String toString() {
    return "\nTeaching Domian: " + domian + "\n Publication: " + publication
        + "\n Staff Id: " + staffId + "\n name: " + name + "\n Phone: " + ph
        + "\n Salary: " + salary + "\n";
  }
}

class Technical extends Staff {
  private String skills;

  public Technical(String staffId, String name, float salary, String ph,
      String skills) {
    super(staffId, name, salary, ph);
    this.skills = skills;
  }

  @Override
  public String toString() {
    return "Technical skills: " + skills + "\n StaffId: " + staffId
        + "\nName: " + name + "\nPhone: " + ph + ", Salary: " + salary + "\n";
  }
}

class Contract extends Staff {
  private String period;

  public Contract(String staffId, String name, float salary, String ph,
      String period) {
    super(staffId, name, salary, ph);
    this.period = period;
  }

  @Override
  public String toString() {
    return "Contract Period: " + period + "\nStaffId: " + staffId
        + "\nName: " + name + "\nPhone: " + ph + "\nSalary: " + salary + "]";
  }
}

public class A_StaffData {
  public static void main(String[] args) {
    int i, choice;
    String staffId, name, ph, domain, publication, skills, period;
    float salary;
    int teachingCount = 0, technicalCount = 0, contractCount = 0;
    Teaching[] teachingStaff = new Teaching[10];
    Contract[] contractStaff = new Contract[10];
    Technical[] technicalStaff = new Technical[10];
    Scanner s = new Scanner(System.in);
    for (;;) {
      System.out.println("1 Teaching Staff Entry");
      System.out.println("2 Technical Staff Entry");
      System.out.println("3 Contract Staff Entry");
      System.out.println("4 Teaching Staff Details");
      System.out.println("5 Technical Staff Details");
      System.out.println("6 Contract Staff Details");
      System.out.println("7.Exit");
      System.out.print("Enter your choice: ");
      choice = s.nextInt();
      switch (choice) {
        case 1:
          System.out.println("+++++++Enter Teaching Details+++++++");
          System.out.print("ID: ");
          staffId = s.next();
          System.out.print("Name: ");
          name = s.next();
          System.out.print("Salary: ");
          salary = s.nextFloat();
          System.out.print("Phone Number: ");
          ph = s.next();
          System.out.print("Domain: ");
          domain = s.next();
          System.out.print("Publication: ");
          publication = s.next();
          teachingStaff[teachingCount] = new Teaching(staffId, name, salary, ph, domain, publication);
          teachingCount++;
          break;
        case 2:
          System.out.println("++++++Enter Technical staffDetails++++++++");
          System.out.print("ID: ");
          staffId = s.next();
          System.out.print("Name: ");
          name = s.next();
          System.out.print("Salary: ");
          salary = s.nextFloat();
          System.out.print("Phone: ");
          ph = s.next();
          System.out.print("Skills: ");
          skills = s.next();
          technicalStaff[technicalCount] = new Technical(staffId, name, salary, ph, skills);
          technicalCount++;
          break;
        case 3:
          System.out.println("+++++++Enter Contract staff details+++++++");
          System.out.print("ID: ");
          staffId = s.next();
          System.out.print("Name: ");
          name = s.next();
          System.out.print("Salary: ");
          salary = s.nextFloat();
          System.out.print("Phone: ");
          ph = s.next();
          System.out.print("Period: ");
          period = s.next();
          contractStaff[contractCount] = new Contract(staffId, name, salary,
              ph, period);
          contractCount++;
          break;
        case 4:
          System.out.println("++++++++Teaching Staff Details+++++++");
          if (teachingCount == 0) {
            System.out.println("No teaching staff details available");
          } else {
            for (i = 0; i < teachingCount; i++) {
              System.out.println(teachingStaff[i]);
            }
          }
          break;
        case 5:
          System.out.println("Technical Staff Details:");
          if (technicalCount == 0) {
            System.out.println("No technical staff details available");
          } else {
            for (i = 0; i < technicalCount; i++) {
              System.out.println(technicalStaff[i]);
            }
          }
          break;
        case 6:
          System.out.println("contract Staff Details:");
          if (contractCount == 0) {
            System.out.println("No contract staff details available");
          } else {
            for (i = 0; i < contractCount; i++) {
              System.out.println(contractStaff[i]);
            }
          }
          break;
        case 7:
          System.exit(0);
      }
    }
  }
}
