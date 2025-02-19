package StudentRecords; //package name

public class Student{
    private int studentId;
    private String name;
    private String grade;

    public Student(int studentId, String name, String grade){  // Constructor
        this.studentId=studentId;
        this.name=name;
        this.grade=grade;
    }

    public void displayStudentInfo(){    // Method to display student details
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }
}
