
package homeworks.employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    private void extend() {
        Employee[] newArray = new Employee[employees.length + 10];

        for (int i = 0; i < employees.length; i++) {
            newArray[i] = employees[i];
        }

        employees = newArray;
    }

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            extend();
        }

        employees[size] = employee;
        size++;
    }

    public void printAllEmployees() {
        if (size == 0) {
            System.out.println("no employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("employee " + (i + 1) + ":");
            System.out.println(employees[i]);
            System.out.println();
        }
    }

    public Employee findById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }

        return null;
    }

    public void findByCompany(String company) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equalsIgnoreCase(company)) {

                System.out.println(
                        employees[i].getName() + " " +
                                employees[i].getSurname() + " - " +
                                employees[i].getPosition()
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("no employees found for company " + company + ".");
        }
    }

}
