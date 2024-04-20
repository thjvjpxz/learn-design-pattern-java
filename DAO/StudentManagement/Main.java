package DAO.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

        for (Student st : studentDaoImpl.getAllStudents()) {
            System.out.println(st);
        }

        Student test = new Student(Student.getIdNext(studentDaoImpl.getAllStudents().size() - 1), "JonyTHI", 21);
        studentDaoImpl.addStudent(test);

        for (Student st : studentDaoImpl.getAllStudents()) {
            System.out.println(st);
        }
        
        test.setName("ThiNe");
        studentDaoImpl.updateStudent(test);

        for (Student st : studentDaoImpl.getAllStudents()) {
            System.out.println(st);
        }

        studentDaoImpl.deleteStudent(test);

        for (Student st : studentDaoImpl.getAllStudents()) {
            System.out.println(st);
        }
    }
}