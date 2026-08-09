
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anotherStudent;

        do {

            
            System.out.println("========================================================");
            System.out.println("                    CAMPUSTRACK");
            System.out.println("========================================================");
            System.out.println("       Student Academic Management System");
            System.out.println("--------------------------------------------------------");

        
            System.out.print("Enter student ID: ");
            String studentId = sc.next();

            sc.nextLine();

            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            while (age < 15 || age > 35) {

                System.out.println(
                        "Invalid age. Enter a value between 15 and 35."
                );

                System.out.print("Enter age: ");
                age = sc.nextInt();
            }

            System.out.println("Age accepted.");

            System.out.print("Enter email: ");
            String email = sc.next();

            System.out.println();
            System.out.println("Select Course");
            System.out.println("1. BCA");
            System.out.println("2. B.Sc Computer Science");
            System.out.println("3. B.E/B. Tech");
            System.out.println("4. MCA");
            System.out.println("5. Other");

            System.out.print("Enter course choice: ");
            int ch = sc.nextInt();

            while (ch < 1 || ch > 5) {

                System.out.println(
                        "Invalid course choice. Select a value from 1 to 5."
                );

                System.out.print("Enter course choice: ");
                ch = sc.nextInt();
            }

            String courseName = "";
            double semFees = 0;

            switch (ch) {

                case 1:
                    courseName = "BCA";
                    semFees = 35000;
                    break;

                case 2:
                    courseName = "B.Sc Computer Science";
                    semFees = 30000;
                    break;

                case 3:
                    courseName = "B.E/B. Tech";
                    semFees = 50000;
                    break;

                case 4:
                    courseName = "MCA";
                    semFees = 45000;
                    break;

                case 5:
                    courseName = "Other";
                    semFees = 25000;
                    break;
            }

            System.out.println("Course selected: " + courseName);

            // ==================================================
            // SEMESTER
            // ==================================================
            System.out.print("Enter semester (1-8): ");
            int no_of_sem = sc.nextInt();

            while (no_of_sem < 1 || no_of_sem > 8) {

                System.out.println(
                        "Invalid semester. Enter a value between 1 and 8."
                );

                System.out.print("Enter semester (1-8): ");
                no_of_sem = sc.nextInt();
            }

            // ==================================================
            // CAREER GOAL
            // ==================================================
            sc.nextLine();

            System.out.print("Enter career goal: ");
            String careerGoal = sc.nextLine();

            // ==================================================
            // JAVA MARKS
            // ==================================================
            System.out.print("Enter Java marks: ");
            int javaMarks = sc.nextInt();

            while (javaMarks < 0 || javaMarks > 100) {

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );

                System.out.print("Enter Java marks: ");
                javaMarks = sc.nextInt();
            }

            // ==================================================
            // SQL MARKS
            // ==================================================
            System.out.print("Enter SQL marks: ");
            int sqlMarks = sc.nextInt();

            while (sqlMarks < 0 || sqlMarks > 100) {

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );

                System.out.print("Enter SQL marks: ");
                sqlMarks = sc.nextInt();
            }

            // ==================================================
            // WEB TECHNOLOGY MARKS
            // ==================================================
            System.out.print("Enter Web Technology marks: ");
            int webMarks = sc.nextInt();

            while (webMarks < 0 || webMarks > 100) {

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );

                System.out.print("Enter Web Technology marks: ");
                webMarks = sc.nextInt();
            }

            // ==================================================
            // APTITUDE MARKS
            // ==================================================
            System.out.print("Enter Aptitude marks: ");
            int aptitudeMarks = sc.nextInt();

            while (aptitudeMarks < 0 || aptitudeMarks > 100) {

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );

                System.out.print("Enter Aptitude marks: ");
                aptitudeMarks = sc.nextInt();
            }

            System.out.print("Enter Communication marks: ");
            int communicationMarks = sc.nextInt();

            while (communicationMarks < 0 || communicationMarks > 100) {

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );

                System.out.print("Enter Communication marks: ");
                communicationMarks = sc.nextInt();
            }

            int totalMarks = javaMarks + sqlMarks + webMarks + aptitudeMarks + communicationMarks;

            double average = (double) totalMarks / 5;

            boolean p_or_f = javaMarks >= 35 && sqlMarks >= 35 && webMarks >= 35 && aptitudeMarks >= 35 && communicationMarks >= 35 && average >= 40;

            String res;

            if (p_or_f) {
                res = "PASSED";
            } else {
                res = "FAILED";
            }

            String grade;

            if (!p_or_f) {

                grade = "F";

            } else if (average >= 85) {

                grade = "A+";

            } else if (average >= 75) {

                grade = "A";

            } else if (average >= 65) {

                grade = "B";

            } else if (average >= 50) {

                grade = "C";

            } else {

                grade = "D";
            }

            System.out.print("Enter total classes conducted: ");
            int totalClasses = sc.nextInt();

            while (totalClasses < 1 || totalClasses > 300) {

                System.out.println("Invalid value. Total classes must be between 1 and 300.");
                System.out.print("Enter total classes conducted: ");
                totalClasses = sc.nextInt();
            }

            System.out.print("Enter classes attended: ");
            int classesAttended = sc.nextInt();

            while (classesAttended < 0 || classesAttended > totalClasses) {

                System.out.println("Invalid attendance. Attended classes cannot exceed " + totalClasses + ".");

                System.out.print("Enter classes attended: ");
                classesAttended = sc.nextInt();
            }

            double attendance = ((double) classesAttended / totalClasses) * 100;

            String status = attendance >= 75 ? "REGULAR" : "SHORTAGE";

            System.out.print("How many assignment scores do you want to enter (1-10): ");

            int numberOfAssignments = sc.nextInt();

            while (numberOfAssignments < 1 || numberOfAssignments > 10) {

                System.out.println("Invalid number. Enter a value between 1 and 10.");

                System.out.print("How many assignment scores do you want to enter? ");

                numberOfAssignments = sc.nextInt();
            }

            int assignmentTotal = 0;
            int validAssignmentCount = 0;

            for (int i = 1; i <= numberOfAssignments; i++) {

                System.out.print("Enter score for assignment " + i + " (0-10, -1 to finish): ");

                int assignmentScore = sc.nextInt();

                if (assignmentScore == -1) {

                    System.out.println("Assignment entry completed early.");

                    break;
                }

                // Invalid score
                if (assignmentScore < 0 || assignmentScore > 10) {

                    System.out.println("Invalid score. Assignment " + i + " skipped.");
                    continue;
                }

                // Valid score
                assignmentTotal = assignmentTotal + assignmentScore;

                validAssignmentCount++;

                System.out.println("Assignment score accepted.");
            }

            double assignmentAverage;

            if (validAssignmentCount > 0) {

                assignmentAverage = (double) assignmentTotal / validAssignmentCount;

            } else {

                assignmentAverage = 0;
            }

            boolean assignmentPassed = validAssignmentCount > 0 && assignmentAverage >= 5;

            String assignmentStatus = assignmentPassed ? "SATISFACTORY" : "NEEDS IMPROVEMENT";

            double scholarshipPercentage;

            if (p_or_f && average >= 85 && attendance >= 85) {
                scholarshipPercentage = 10;
            } else if (p_or_f && average >= 75 && attendance >= 75) {
                scholarshipPercentage = 5;

            } else {
                scholarshipPercentage = 0;
            }

            double scholarshipAmount = semFees * scholarshipPercentage / 100;

            double finalPayableFee = semFees - scholarshipAmount;

            System.out.printf("Final payable fee: %.2f%n", finalPayableFee);

            System.out.print("Enter fee paid: ");
            double feePaid = sc.nextDouble();

            while (feePaid < 0 || feePaid > finalPayableFee) {

                System.out.printf("Invalid fee amount. Enter a value between ₹0 and ₹%.2f.%n", finalPayableFee);
                System.out.print("Enter fee paid: ");
                feePaid = sc.nextDouble();
            }

            double feeBalance = finalPayableFee - feePaid;

            String feeStatus = feeBalance == 0 ? "PAID" : "PENDING";

            String semStatus = p_or_f && attendance >= 75 && assignmentPassed && feeBalance == 0 ? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";

            System.out.println();
            System.out.println("========================================================");

            System.out.println("                 STUDENT SEMESTER REPORT");

            System.out.println("========================================================");

            System.out.println("Student ID                 : " + studentId);

            System.out.println("Student Name               : " + studentName);

            System.out.println("Age                        : " + age);

            System.out.println("Email                      : " + email);

            System.out.println("Course                     : " + courseName);

            System.out.println("Semester                   : " + no_of_sem);

            System.out.println("Career Goal                : " + careerGoal);

            System.out.println();
            System.out.println("---------------- ACADEMIC SUMMARY --------------------");

            System.out.println("Java Marks                 : " + javaMarks);

            System.out.println("SQL Marks                  : " + sqlMarks);

            System.out.println("Web Technology Marks       : " + webMarks);

            System.out.println("Aptitude Marks             : " + aptitudeMarks);

            System.out.println("Communication Marks        : " + communicationMarks);

            System.out.println("Total Marks                : " + totalMarks + "/500");

            System.out.printf("Percentage                 : %.2f%%%n", average);

            System.out.println("Academic Result            : " + res);

            System.out.println("Grade                      : " + grade);

            System.out.println();
            System.out.println("---------------- ATTENDANCE SUMMARY ------------------");

            System.out.println("Classes Conducted          : " + totalClasses);

            System.out.println("Classes Attended           : " + classesAttended);

            System.out.printf("Attendance Percentage      : %.2f%%%n", attendance);

            System.out.println("Attendance Status          : " + status);

            System.out.println();
            System.out.println("---------------- ASSIGNMENT SUMMARY ------------------");

            System.out.println("Valid Assignments          : " + validAssignmentCount);

            System.out.println("Assignment Total           : " + assignmentTotal);

            System.out.printf("Assignment Average         : %.2f%n", assignmentAverage);

            System.out.println("Assignment Status          : " + assignmentStatus);

            System.out.println();
            System.out.println("---------------- FEE SUMMARY -------------------------");

            System.out.printf("Base Semester Fee          : %.2f%n", semFees);

            System.out.printf("Scholarship Percentage     : %.0f%%%n", scholarshipPercentage);

            System.out.printf("Scholarship Amount         : %.2f%n", scholarshipAmount);

            System.out.printf("Final Payable Fee          : %.2f%n", finalPayableFee);

            System.out.printf("Fee Paid                   : %.2f%n", feePaid);

            System.out.printf("Fee Balance                : %.2f%n", feeBalance);

            System.out.println("Fee Status                 : " + feeStatus);

            System.out.println();
            System.out.println("---------------- FINAL STATUS ------------------------");

            System.out.println("Semester Clearance         : " + semStatus);

            System.out.println();
            System.out.println(
                    "---------------- FAILED CONDITIONS -------------------"
            );

            boolean anyFailure = false;

            if (javaMarks < 35) {

                System.out.println("- Java marks are below 35.");

                anyFailure = true;
            }

            if (sqlMarks < 35) {

                System.out.println("- SQL marks are below 35.");

                anyFailure = true;
            }

            if (webMarks < 35) {

                System.out.println("- Web Technology marks are below 35.");

                anyFailure = true;
            }

            if (aptitudeMarks < 35) {

                System.out.println("- Aptitude marks are below 35.");

                anyFailure = true;
            }

            if (communicationMarks < 35) {

                System.out.println("- Communication marks are below 35.");

                anyFailure = true;
            }

            if (average < 40) {

                System.out.println("- Overall percentage is below 40%.");

                anyFailure = true;
            }

            if (attendance < 75) {

                System.out.println("- Attendance is below 75%.");

                anyFailure = true;
            }

            if (validAssignmentCount == 0) {

                System.out.println("- No valid assignment score was entered.");

                anyFailure = true;

            } else if (assignmentAverage < 5) {

                System.out.println("- Assignment average is below 5.00.");

                anyFailure = true;
            }

            if (feeBalance > 0) {

                System.out.println("- Semester fee is pending.");

                anyFailure = true;
            }

            if (!anyFailure) {

                System.out.println("None");
            }

            System.out.println();
            System.out.println("---------------- RECOMMENDATIONS ---------------------");

            boolean recommendationShown = false;

            if (javaMarks < 35 || sqlMarks < 35 || webMarks < 35 || aptitudeMarks < 35 || communicationMarks < 35) {

                System.out.println("- Revisit the failed subject and complete additional practice.");

                recommendationShown = true;
            }

            if (average < 40) {

                System.out.println("- Improve overall academic performance.");

                recommendationShown = true;
            }

            if (attendance < 75) {

                System.out.println("- Attend classes regularly and clear the attendance shortage.");

                recommendationShown = true;
            }

            if (validAssignmentCount == 0 || assignmentAverage < 5) {

                System.out.println("- Complete assignments consistently and maintain an average of at least 5.00.");

                recommendationShown = true;
            }

            if (feeBalance > 0) {

                System.out.println("- Pay the pending semester fee before clearance.");

                recommendationShown = true;
            }

            if (!recommendationShown) {

                System.out.println("Maintain the current performance in the next semester.");
            }

            System.out.println("========================================================");

            System.out.println();
            System.out.println("Do you want to process another student?");

            System.out.println("1. Yes");
            System.out.println("0. No");

            System.out.print("Enter choice: ");
            anotherStudent = sc.nextInt();

            while (anotherStudent != 1 && anotherStudent != 0) {

                System.out.println("Invalid choice. Enter 1 for Yes or 0 for No.");

                System.out.print("Enter choice: ");
                anotherStudent = sc.nextInt();
            }

        } while (anotherStudent == 1);

        System.out.println();
        System.out.println("Thank you for using CampusTrack.");

        sc.close();
    }
}
