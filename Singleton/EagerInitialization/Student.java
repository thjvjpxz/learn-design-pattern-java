package Singleton.EagerInitialization;

public class Student {
    /**
     * Ưu điểm:
     *  - Tránh được vấn đề đồng thời nhiều thread, đảm bảo chỉ có 1 instance duy nhất được tạo
     * Nhược điểm:
     *  - Instance được tạo ngay khi class được tải --> Có thể không sử dụng đến dẫn tới lãng phí tài nguyên
     */
    private static final Student instance = new Student();
    private String name;
    private int age;
    private Student() {}
    public static Student Instance() {
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