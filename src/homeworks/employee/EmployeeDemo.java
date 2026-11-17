
package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. add employee");
            System.out.println("2. rint all employees");
            System.out.println("3. search employee by ID");
            System.out.println("4. search employees by company");
            System.out.println("0. exit");
            System.out.print("choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("enter surname: ");
                    String surname = scanner.nextLine();

                    System.out.print("enter employee ID: ");
                    String employeeID = scanner.nextLine();

                    System.out.print("enter salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());

                    System.out.print("enter company: ");
                    String company = scanner.nextLine();

                    System.out.print("enter position: ");
                    String position = scanner.nextLine();

                    Employee employee = new Employee(
                            name, surname, employeeID,
                            salary, company, position
                    );

                    storage.addEmployee(employee);

                    System.out.println("employee added successfully!");
                    break;

                case 2:
                    storage.printAllEmployees();
                    break;

                case 3:
                    System.out.print("enter employee ID: ");
                    String searchID = scanner.nextLine();

                    Employee foundEmployee = storage.findById(searchID);

                    if (foundEmployee != null) {
                        System.out.println(foundEmployee);
                    } else {
                        System.out.println("employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("enter company name: ");
                    String searchCompany = scanner.nextLine();

                    storage.findByCompany(searchCompany);
                    break;

                case 0:
                    System.out.println("bye");
                    scanner.close();
                    return;

                default:
                    System.out.println("invalid option. Please try again.");
            }
        }
    }
}
