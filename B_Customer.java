import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Customer {
  private String name;
  private String dob;

  void Read_Customer(String n, String d) {
    name = n; 
    dob = d;
  }
  void Display_Customer(){ 
    StringTokenizer st = new StringTokenizer(dob,"/"); 
    System.out.println("\n++++++++++Customer Details Are++++++++++++++"); 
    System.out.println("Name," + " \t" + "DD, MM, YYYY");
    System.out.print(name+"\t");
    while(st.hasMoreTokens()){
      System.out.print(st.nextToken() + ", ");
    }
  }
}
/**
 * B_Customer
 */
public class B_Customer {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Customer c = new Customer();
    System.out.print("Enter name: ");
    String name = br.readLine();
    System.out.print("Enter DOB in (DD/MM/YYYY): ");
    String dob = br.readLine();
    c.Read_Customer(name, dob);
    c.Display_Customer();
  }
}
