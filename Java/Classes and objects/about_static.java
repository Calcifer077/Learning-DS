public class about_static {
    public static void main(String[] args) {
        Student s = new Student();
        s.schoolName = "ABC";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    String name;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    void getName() {
        System.out.println(this.name);
    }
}