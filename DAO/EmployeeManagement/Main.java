package DAO.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoImpl employees = EmployeeDaoImpl.Instance();

        for (Employee e : employees.getAllEmployees()) {
            System.out.println(e);
        }

        Employee employeeNew = new Employee(10, "Thi", 21, "DEV", "DEV000", (short)101);

        System.out.println("ADD");        

        employees.addEmployee(employeeNew);
    
        for (Employee e : employees.getAllEmployees()) {
            System.out.println(e);
        }

        System.out.println("REMOVE");
        
        employees.removeEmployee(employeeNew);

        for (Employee e : employees.getAllEmployees()) {
            System.out.println(e);
        }
    }
}