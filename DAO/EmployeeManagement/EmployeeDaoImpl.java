package DAO.EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDAO {
    private List<Employee> employees;
    private static EmployeeDaoImpl instance;

    private EmployeeDaoImpl() {
        employees = new ArrayList<>();
        Employee employee;
        for (int i = 0; i < 10; i++) {
            employee = new Employee();
            employee.setId(i);
            employee.setName("Employee Name " + i);
            employee.setAge(18 + i);
            employee.setCode("EMP00" + i);
            employee.setDepartment("Hacker");
            employee.setSalaryRate((short)(50 + i));
            employees.add(employee);
        }
    }

    public static EmployeeDaoImpl Instance() {
        if (instance == null)
            instance = new EmployeeDaoImpl();
        return instance;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    private boolean checkIdExist(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
                return true;
        }
        return false;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (checkIdExist(employee.getId())) {
            System.out.println("ID đã tồn tại, nhập ID khác");
            return;
        }
        if (!employee.checkRate(employee.getSalaryRate())) {
            System.out.println("Phần trăm lương phải >= 0 và <= 100");
            return;
        }
        employees.add(employee);
        System.out.println("Thêm thành công nhân viên mới");
    }

    @Override
    public void removeEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println("Xóa thành công nhân viên " + employee.getName());
            return;
        }
        System.out.println("Nhân viên không tồn tại");
    }
}