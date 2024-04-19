package Singleton.LazyInitialization;

public class Student {
    private static Student instance;
    private String name;
    private int age;

    private Student() {}

    public static Student Instance() {
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
