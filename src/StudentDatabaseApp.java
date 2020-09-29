import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {


        // Ask how many new students we want to add
        System.out.println("Enter number of students to enroll");
        Scanner in = new Scanner(System.in);
        int numOfStudnets = in.nextInt();
        Student[] students = new Student[numOfStudnets];
        

        // Create n number of new students
        for (int i = 0; i < students.length ; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i]);
        }
    }
}
