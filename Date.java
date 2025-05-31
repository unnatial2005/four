class student {
    private String name;
    private int rollNumber;
    private String course;

    public student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}
public class Date{
    public static void main(String[] args) {
        student stud = new student("Alice", 101, "Computer Science");
        stud.display();
    }
}
