package DAO.StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {
    private List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
      Student student1 = new Student(0, "Robert",20);
      Student student2 = new Student(1, "John",19);
      students.add(student1);
      students.add(student2);	
    }

    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        int idMaxCurr = Student.getIdNext(students.get(students.size() - 1).getId());
        student.setId(idMaxCurr);
        students.add(student);
        System.out.println("Thêm thành công sinh viên :" + student);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getId()).setName(student.getName());
        students.get(student.getId()).setAge(student.getAge());
        System.out.println("Sửa thành công sinh viên :" + student);
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getId());
        System.out.println("Xóa thành công sinh viên :" + student);
    }
}