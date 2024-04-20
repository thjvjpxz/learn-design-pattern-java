package DAO.EmployeeManagement;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}