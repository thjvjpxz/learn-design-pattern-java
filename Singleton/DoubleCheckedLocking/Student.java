package Singleton.DoubleCheckedLocking;

public class Student {

    /**
     * Ưu điểm:
     *  - Kết hợp giữa Lazy Initialization và Earn Initialization để tối ưu hóa hiệu suất
     * Nhược điểm:
     *  - Phức tạp hơn
     */

    private static Student instance;
    private String name;
    private int age;

    private Student() {}

    public static synchronized Student Instance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}";
    }
}