package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeStorage employeeStorage = new EmployeeStorage();
        CompanyStorage companyStorage = new CompanyStorage();

        while (true) {

            System.out.println("0. exit");
            System.out.println("1. add employee");
            System.out.println("2. print all employees");
            System.out.println("3. search employee by ID");
            System.out.println("4. print employees by company name");
            System.out.println("5. add company");
            System.out.println("6. print all companies");
            System.out.println("7. search company by ID");
            System.out.println("8. print employees by company ID");
            System.out.println("9. change employee company");
            System.out.println("10. print employee's company info");

            System.out.print("choose command: ");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {

                case 0:
                    System.out.println("bye");
                    return;

                case 1:
                    System.out.print("enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("enter surname: ");
                    String surname = scanner.nextLine();

                    System.out.print("enter employee ID: ");
                    String employeeID = scanner.nextLine();

                    System.out.print("enter salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());

                    System.out.print("enter company ID: ");
                    String companyID = scanner.nextLine();

                    Company company = companyStorage.getById(companyID);

                    if (company == null) {
                        System.out.println("company not found. employee was not added.");
                        break;
                    }

                    System.out.print("enter position: ");
                    String position = scanner.nextLine();

                    Employee employee = new Employee(
                            name, surname, employeeID,
                            salary, company, position
                    );

                    employeeStorage.add(employee);
                    System.out.println("employee added successfully");
                    break;

                case 2:
                    employeeStorage.printAll();
                    break;

                case 3:
                    System.out.print("enter employee ID: ");
                    String searchEmployeeID = scanner.nextLine();

                    Employee foundEmployee = employeeStorage.getById(searchEmployeeID);

                    if (foundEmployee == null) {
                        System.out.println("employee not found.");
                    } else {
                        System.out.println(foundEmployee);
                    }
                    break;

                case 4:
                    System.out.print("enter company name: ");
                    String companyName = scanner.nextLine();

                    employeeStorage.printByCompanyName(companyName);
                    break;

                case 5:
                    System.out.print("enter company ID: ");
                    String newCompanyID = scanner.nextLine();

                    System.out.print("enter company name: ");
                    String newCompanyName = scanner.nextLine();

                    System.out.print("enter industry: ");
                    String industry = scanner.nextLine();

                    System.out.print("enter country: ");
                    String country = scanner.nextLine();

                    Company newCompany = new Company(
                            newCompanyID, newCompanyName, industry, country
                    );

                    companyStorage.add(newCompany);
                    break;

                case 6:
                    companyStorage.printAll();
                    break;

                case 7:
                    System.out.print("enter company ID: ");
                    String searchCompanyID = scanner.nextLine();

                    Company foundCompany = companyStorage.getById(searchCompanyID);

                    if (foundCompany == null) {
                        System.out.println("company not found.");
                    } else {
                        System.out.println(foundCompany);
                    }
                    break;

                case 8:
                    System.out.print("enter company ID: ");
                    String employeeCompanyID = scanner.nextLine();

                    employeeStorage.printByCompanyId(employeeCompanyID);
                    break;

                case 9:
                    System.out.print("enter employee ID: ");
                    String changeEmployeeID = scanner.nextLine();

                    Employee employeeToChange = employeeStorage.getById(changeEmployeeID);

                    if (employeeToChange == null) {
                        System.out.println("employee not found.");
                        break;
                    }

                    System.out.print("enter new company ID: ");
                    String targetCompanyID = scanner.nextLine();

                    Company targetCompany = companyStorage.getById(targetCompanyID);

                    if (targetCompany == null) {
                        System.out.println("company not found.");
                        break;
                    }

                    employeeToChange.setCompany(targetCompany);
                    System.out.println("employee company changed successfully");
                    break;

                case 10:
                    System.out.print("enter employee ID: ");
                    String infoEmployeeID = scanner.nextLine();

                    Employee infoEmployee = employeeStorage.getById(infoEmployeeID);

                    if (infoEmployee == null) {
                        System.out.println("employee not found.");
                    } else {
                        System.out.println(infoEmployee.getCompany());
                    }
                    break;

                default:
                    System.out.println("invalid command :(((");
            }
        }
    }
}