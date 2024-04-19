package Singleton.LazyInitialization;

public class Main {
    public static void main(String[] args) {
        Student st = Student.Instance();
        st.setName("Thi");
        st.setAge(22);
        
        Student st2 = Student.Instance();
        System.out.println(st);
        System.out.println(st2);
    }
}
