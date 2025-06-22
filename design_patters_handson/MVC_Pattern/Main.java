package DesignPatterns.MVC_Pattern;

public class Main {
    public static void main(String[] args) {
        // Model
        Student student = new Student();
        student.setName("Priyanshu Sharma");
        student.setId("S123");
        student.setGrade("A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial student data
        controller.updateView();

        // Update data
        controller.setStudentGrade("A+");
        controller.setStudentName("Amit S.");

        // Display updated data
        controller.updateView();
    }
}
