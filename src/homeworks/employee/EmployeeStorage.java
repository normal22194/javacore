package homeworks.employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(employee)) {
                System.out.println("employee already exists");
                return;
            }
        }

        if (size == employees.length) {
            extend();
        }

        employees[size++] = employee;
    }

    private void extend() {
        Employee[] newEmployees = new Employee[employees.length + 10];

        for (int i = 0; i < size; i++) {
            newEmployees[i] = employees[i];
        }

        employees = newEmployees;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("no employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
            System.out.println("--------------------");
        }
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                return employees[i];
            }
        }

        return null;
    }

    public void printByCompanyName(String name) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getName().equalsIgnoreCase(name)) {
                System.out.println(employees[i]);
                System.out.println("--------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("no employees found for this company.");
        }
    }

    public void printByCompanyId(String id) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equals(id)) {
                System.out.println(employees[i]);
                System.out.println("--------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("no employees found for this company.");
        }
    }
}