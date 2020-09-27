import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private String tuitionBalance;
    private static final int costOfCourse = 600;
    private static int id = 1000;

    // Constructor : prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level");
        this.gradeYear = in.nextInt();
    }

    // Generate an ID


    // Enroll in courses

    // View balance and pay tuition

    // Show status
}
