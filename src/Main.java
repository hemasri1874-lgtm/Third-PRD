
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("			        CAMPUSTRACK		              ");
        System.out.println("==================================================");
        System.out.println("	Simple Student Result Management System	      ");
        System.out.println("--------------------------------------------------");

        System.out.print("Enter student ID: ");
        String studentId = sc.next();
        sc.nextLine();

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        while (age < 16 || age > 30) {
            System.out.println("Invalid age. Enter a value between 16 and 30.");
            System.out.print("Enter age: ");
            age = sc.nextInt();
        }

        System.out.println();
        System.out.println("Select Course");
        System.out.println("1. BCA");
        System.out.println("2. B.Sc Computer Science");
        System.out.println("3. B.E/B. Tech");
        System.out.print("Enter course choice: ");

        int ch = sc.nextInt();

        while (ch < 1 || ch > 3) {
            System.out.println("Invalid course choice. Enter a value from 1 to 3");
            System.out.print("Enter course choice: ");
            ch = sc.nextInt();
        }

        String courseName = "";
        double semFees = 0;

        switch (ch) {
            case 1 -> {
                courseName = "BCA";
                semFees = 30000;
            }
            case 2 -> {
                courseName = "B.Sc Computer Science";
                semFees = 35000;
            }
            case 3 -> {
                courseName = "B.E/B. Tech";
                semFees = 50000;
            }
        }

        System.out.println("Course selected: " + courseName);
        //System.out.printf("Semester fee: ₹%.2f%n", semFees);

        System.out.print("Enter Java marks: ");
        int javaMarks = sc.nextInt();

        while (javaMarks < 0 || javaMarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.print("Enter Java marks: ");
            javaMarks = sc.nextInt();
        }

        System.out.print("Enter SQL marks: ");
        int sqlMarks = sc.nextInt();

        while (sqlMarks < 0 || sqlMarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.print("Enter SQL marks: ");
            sqlMarks = sc.nextInt();
        }

        System.out.print("Enter Aptitude marks: ");
        int aptitudeMarks = sc.nextInt();

        while (aptitudeMarks < 0 || aptitudeMarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.print("Enter Aptitude marks: ");
            aptitudeMarks = sc.nextInt();
        }

        int totalMarks = (javaMarks + sqlMarks + aptitudeMarks);
        double average = totalMarks / 3.0;

        boolean p_or_f = javaMarks >= 35 && sqlMarks >= 35 && aptitudeMarks >= 35;

        String res;
        if (p_or_f) {
            res = "PASSED";
        } else {
            res = "FAILED";
        }

        String grade;

        if (!p_or_f) {
            grade = "F";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        while (attendance < 0 || attendance > 100) {
            System.out.println("Invalid Attendance, reenter the attendance%");
            System.out.print("Enter attendance percentage: ");
            attendance = sc.nextDouble();
        }

        String status = attendance >= 75 ? "SUFFICIENT" : "SHORTAGE";

        System.out.print("Enter fee paid: ");
        double feePaid = sc.nextDouble();

        while (feePaid < 0 || feePaid > semFees) {
            System.out.printf("Invalid fee amount. Enter a value between ₹0 and ₹%.2f.%n", semFees);
            System.out.print("Enter fee paid: ");
            feePaid = sc.nextDouble();
        }

        double feeBalance = semFees - feePaid;

        String feeStatus = feeBalance == 0 ? "CLEARED" : "PENDING";

        String semStatus = p_or_f && attendance >= 75 && feeBalance == 0 ? "SEMESTER CLEARED" : "SEMESTER NOT CLEARED";

        System.out.println();
        System.out.println("==================================================");
        System.out.println("              STUDENT SEMESTER REPORT             ");
        System.out.println("==================================================");

        System.out.println("Student ID          : " + studentId);
        System.out.println("Student Name        : " + studentName);
        System.out.println("Age                 : " + age);
        System.out.println("Course              : " + courseName);

        System.out.println("--------------- ACADEMIC DETAILS -----------------");
        System.out.println("Java Marks          : " + javaMarks);
        System.out.println("SQL Marks           : " + sqlMarks);
        System.out.println("Aptitude Marks      : " + aptitudeMarks);
        System.out.println("Total Marks         : " + totalMarks + "/ 300");
        System.out.printf("Average             : %.2f%n", average);
        System.out.println("Academic Result     : " + res);
        System.out.println("Grade               : " + grade);

        System.out.println("--------------- ATTENDANCE DETAILS ---------------");
        System.out.printf("Attendance          : %.2f%%\n", attendance);
        System.out.println("Attendance Status   : " + status);

        System.out.println("------------------ FEE DETAILS --------------------");
        System.out.println("Semester Fee        : " + semFees);
        System.out.println("Fee paid            : " + feePaid);
        System.out.println("Fee Balance         : " + feeBalance);
        System.out.println("Fee Status          : " + feeStatus);

        System.out.println("---------------- FINAL STATUS ---------------------");
        System.out.println("Semester Status     : " + semStatus);

        if (!semStatus.equals("SEMESTER CLEARED")) {
            System.out.println();
            System.out.println("Reasons:");

            if (javaMarks < 35) {
                System.out.println("- Java marks are below 35.");
            }
            if (sqlMarks < 35) {
                System.out.println("- SQL marks are below 35.");
            }

            if (aptitudeMarks < 35) {
                System.out.println("- Aptitude marks are below 35.");
            }

            if (attendance < 75) {
                System.out.println("- Attendance is below 75%.");
            }

            if (feeBalance > 0 && "SHORTAGE".equals(status)) {
                System.out.println("- Semester fee is pending.");
            }

        }
    }
}
