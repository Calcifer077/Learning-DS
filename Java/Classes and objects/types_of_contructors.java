public class types_of_contructors {
    public static void main(String[] args) {
        Student s1 = new Student("Tony", 10);

        s1.marks[0] = 10;
        s1.marks[1] = 9;
        s1.marks[2] = 8;

        // Copy constructor
        Student s2 = new Student(s1);
        // System.out.println(s2.name);

        // In shallow copy all the changes even made after creating a copy will reflect
        // but will not happen in deep constructor.
        s1.marks[1] = 10;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    int marks[];

    // Various type of contructor

    // Non-parametrized
    Student() {
        marks = new int[3];
        System.out.println("Constructor called...");
    }

    // Parameterized
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }

    // shallow copy constructor
    // Student(Student s) {
    // marks = new int[3];
    // this.name = s.name;
    // this.roll = s.roll;
    // this.marks = s.marks;
    // }

    // deep copy contructor
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}

// Destructor -> destroys an object. Is automatically done by garbage collector
// in java.