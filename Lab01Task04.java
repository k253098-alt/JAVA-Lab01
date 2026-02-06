package Lab01Task01;

import java.util.Scanner;

public class Lab01Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double marks;
        int failStudents = 0;
        int passStudents = 0;
        double avg;
        double totalMarks = 0;
        System.out.println("Enter the number of students: ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.printf("Enter the marks of student %d :", i + 1);
            marks = sc.nextDouble();
            if (marks < 60) {
                failStudents++;
                totalMarks += marks;
            } else if (marks >= 60) {
                passStudents++;
                totalMarks += marks;
            } else {
                System.out.println("Invalid marks!");
            }
        }

        avg = totalMarks/x;

        System.out.printf("The number of students failled are %d\n", failStudents);
        System.out.printf("The number of students passed are %d\n", passStudents);
        System.out.printf("The average of Students is %.2f",avg);

    }
}