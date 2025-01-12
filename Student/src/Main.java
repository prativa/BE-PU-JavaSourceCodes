import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Student student = new Student();
        Student student = new Student("test name");

        String initialNameOfStudent = student.getName();
        System.out.printf("Students initial name %s%n",initialNameOfStudent);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Get Student's name :: ");

        String studentName = scanner.nextLine();
        student.setName(studentName);
        String newValueOfStudent = student.getName();
        System.out.printf("New value of student %s%n",newValueOfStudent);

    }
}