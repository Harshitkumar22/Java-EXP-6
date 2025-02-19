import StudentRecords.Student;

public class Main3{
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student(101, "Harshit kumar", "A");
        Student student2 = new Student(102, "Dhairya thareja", "A");

        // Displaying student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}