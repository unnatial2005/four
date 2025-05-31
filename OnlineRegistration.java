class Course {
    String name;
    int marks;
    int id;

    Course(String name, int marks, int id) {
        this.name = name;
        this.marks = marks;
        this.id = id;
    }
}

class Student {
    String name = "Unnati";
    String program = "BCA";
    int semester = 4;
    
    Course[] courses = {
        new Course("Math", 35, 1),
        new Course("Java", 75, 2),
        new Course("English", 30, 3)
    };

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course c : courses) {
            System.out.println("  - " + c.name + " (ID: " + c.id + ")");
        }
    }

    void displayLowMarks() {
        System.out.println("\nCourses with marks < 40:");
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println("  " + c.name + " (ID: " + c.id + ") - Marks: " + c.marks);
            }
        }
    }
}

public class OnlineRegistration {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
        s.displayLowMarks();
    }
}
