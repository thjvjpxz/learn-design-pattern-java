package DAO.StudentManagement;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}