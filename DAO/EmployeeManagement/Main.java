package DAO.EmployeeManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            EmployeeDaoImpl employees = EmployeeDaoImpl.Instance();

            while (true) {
                printMenu();
                System.out.print("Enter your choice: "); 
                int n = Integer.parseInt(sc.nextLine());
                
                if (n == 4) break;

                switch (n) {
                    case 1:
                        employees = inputEmployee(employees, sc);
                        break;
                    case 2:
                        removeEmployee(employees, sc);
                        break;
                    case 3:
                        displayAllEmployees(employees);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("=======Menu=======");
        System.out.println("1. Add new employee");
        System.out.println("2. Remove employee");
        System.out.println("3. Display all employees");
        System.out.println("4. Exit");
    }

    public static void displayAllEmployees(EmployeeDaoImpl employees) {
        for (Employee e : employees.getAllEmployees()) {
            System.out.println(e);
        }
    }

    public static EmployeeDaoImpl inputEmployee(EmployeeDaoImpl employees, Scanner sc) {
        Employee employee = new Employee();
        employee.setId(employees.getNextId());
        System.out.print("Enter name of employee: ");
        employee.setName(sc.nextLine());
        System.out.print("Enter age of employee: ");
        employee.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter code: ");
        employee.setCode(sc.nextLine());
        System.out.print("Enter department: ");
        employee.setDepartment(sc.nextLine());
        System.out.print("Enter salary rate: ");
        employee.setSalaryRate(Short.parseShort(sc.nextLine()));
        employees.addEmployee(employee);

        return employees;
    }

    public static void removeEmployee(EmployeeDaoImpl employees, Scanner sc) {
        System.out.println("Nhập ID nhân viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee();
        employee.setId(id);
        employees.removeEmployee(employee);
    }
}