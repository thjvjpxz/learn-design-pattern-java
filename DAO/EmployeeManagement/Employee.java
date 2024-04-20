package DAO.EmployeeManagement;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private short salaryRate;

    public Employee() {}

    public Employee(int id, String name, int age, String department, String code, short salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public boolean checkRate(short rate) {
        return rate >= 0 && rate <= 100;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    } 

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSalaryRate(short salaryRate) {
        if (!checkRate(salaryRate)) {
            System.out.println("Phần trăm lương phải >= 0 và <= 100");
            return;
        }
        this.salaryRate = salaryRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public short getSalaryRate() {
        return salaryRate;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", code=" + code + ", salaryRate=" + salaryRate + "]";
    }
}