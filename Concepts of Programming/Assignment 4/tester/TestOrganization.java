package tester;
import com.app.org.*;
import java.util.Scanner;

public class TestOrganization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp[] org = new Emp[10];
        int count = 0;
        
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Hire Manager");
            System.out.println("2. Hire Worker");
            System.out.println("3. Display information of all employees including net salary");
            System.out.println("4. Update basic salary");
            System.out.println("5. Exit");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter department ID: ");
                    int deptId = sc.nextInt();
                    System.out.print("Enter basic salary: ");
                    double basic = sc.nextDouble();
                    System.out.print("Enter performance bonus: ");
                    double perfBonus = sc.nextDouble();
                    org[count++] = new Mgr(firstName, lastName, deptId, basic, perfBonus);
                    System.out.println("Manager hired successfully.");
                    break;
                    
                case 2:
                    System.out.print("Enter first name: ");
                    firstName = sc.nextLine();
                    System.out.print("Enter last name: ");
                    lastName = sc.nextLine();
                    System.out.print("Enter department ID: ");
                    deptId = sc.nextInt();
                    System.out.print("Enter basic salary: ");
                    basic = sc.nextDouble();
                    System.out.print("Enter hours worked: ");
                    double hoursWorked = sc.nextDouble();
                    System.out.print("Enter hourly rate: ");
                    double hourlyRate = sc.nextDouble();
                    org[count++] = new worker(firstName, lastName, deptId, basic, hoursWorked, hourlyRate);
                    System.out.println("Worker hired successfully.");
                    break;
                    
                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(org[i].toString() + ", Net salary: " + org[i].computeNetSalary());
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter salary increment: ");
                    double increment = sc.nextDouble();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (org[i].getId() == id) {
                            org[i].basic += increment;
                            System.out.println("Basic salary updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + id + " not found.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

