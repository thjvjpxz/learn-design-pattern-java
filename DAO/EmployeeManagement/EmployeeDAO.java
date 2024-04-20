package DAO.EmployeeManagement;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}

// public interface EmployeeDAO<T> {
//     List<T> getAll();
//     void add(T employee);
//     void remove(T employee);
// }