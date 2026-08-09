# CampusTrack - Student Academic Management System

## 1. Project Title

**CampusTrack: Student Academic Management System**

CampusTrack is a beginner-friendly Java console application that collects and processes student academic information, attendance, assignment performance, scholarship eligibility, fee payment, semester-clearance status, and recommendations.

The project is implemented using core Java concepts and runtime input through `Scanner`.

---

## 2. Problem Statement

Colleges need a simple way to review a student's overall academic progress.

CampusTrack is designed to collect and process:

- Student profile details
- Course and semester information
- Marks in five subjects
- Overall academic result and grade
- Attendance information
- Assignment performance
- Scholarship eligibility
- Semester-fee payment
- Final semester-clearance status
- Recommendations based on failed conditions

The application validates numeric inputs, performs the required calculations, applies the defined academic rules, and displays a complete student semester report.

The program processes one student at a time and allows the operator to process another student after displaying the report.

---

## 3. Features

The CampusTrack application provides the following features:

- Student profile management
- Full-name and career-goal input using `nextLine()`
- Age validation
- Course selection using a menu
- Course and semester-fee assignment using `switch`
- Five subject mark inputs
- Subject-mark validation
- Total marks and percentage calculation
- Academic pass/fail evaluation
- Grade calculation
- Attendance percentage calculation
- Attendance status determination
- Assignment score processing
- Invalid assignment handling using `continue`
- Early assignment completion using `break`
- Assignment average calculation
- Assignment status determination
- Scholarship eligibility calculation
- Scholarship amount calculation
- Final payable fee calculation
- Fee payment and balance calculation
- Fee status determination
- Final semester-clearance evaluation
- Display of every applicable failed condition
- Recommendations based on failed conditions
- Processing another student using `do-while`
- Formatted and readable console output

---

## 4. Concepts Used

The project uses the following core Java concepts:

### Java Fundamentals

- Java program structure
- Variables
- Primitive data types
- `String`
- `Scanner`

### Operators

- Arithmetic operators
- Assignment operators
- Relational operators
- Logical operators
- Ternary operator

### Decision Making

- `if`
- `else if`
- `else`
- Nested conditions
- Compound Boolean expressions
- `switch`

### Loops

- `while`
- `for`
- `do-while`

### Loop Control

- `break`
- `continue`

### Input and Output

- `System.out.print()`
- `System.out.println()`
- `System.out.printf()`
- `next()`
- `nextInt()`
- `nextDouble()`
- `nextLine()`

### Type Conversion

Explicit casting is used when calculating percentages and averages to ensure decimal results.

### Concepts Not Used

The project intentionally does not use:

- Arrays
- Collections
- User-defined methods
- Additional user-defined classes
- Constructors
- Exception handling
- File handling
- Database connectivity
- Inheritance
- Streams
- Lambda expressions
- GUI development
- Web development

All program logic is written inside the `main()` method.

---

## 5. Input Details

The program collects the following information.

### Student Profile

| Field | Data Type | Rule |
|---|---|---|
| Student ID | `String` | Single-word input |
| Full Name | `String` | Complete-line input |
| Age | `int` | 15 to 35 |
| Email | `String` | Single-word input |
| Course Choice | `int` | 1 to 5 |
| Semester | `int` | 1 to 8 |
| Career Goal | `String` | Complete-line input |

### Course Options

| Choice | Course | Base Semester Fee |
|---:|---|---:|
| 1 | BCA | ₹35,000 |
| 2 | B.Sc Computer Science | ₹30,000 |
| 3 | B.E/B.Tech | ₹50,000 |
| 4 | MCA | ₹45,000 |
| 5 | Other | ₹25,000 |

### Subjects

The program accepts marks for exactly five subjects:

1. Java
2. SQL
3. Web Technology
4. Aptitude
5. Communication

Each subject is stored in a separate variable.

### Attendance

The program collects:

- Total classes conducted
- Classes attended

The attendance percentage is calculated from these values.

### Assignments

The program asks for the number of assignment entries and accepts individual assignment scores.

Each score must be between `0` and `10`.

The value `-1` is used to finish assignment entry early.

### Fees

The program calculates:

- Base semester fee
- Scholarship percentage
- Scholarship amount
- Final payable fee
- Amount paid
- Fee balance
- Fee status

---

## 6. Validation Rules

### Age

Age must be between **15 and 35**, inclusive.

```text
15 <= age <= 35

OUTPUT:

========================================================
                    CAMPUSTRACK
========================================================
       Student Academic Management System
--------------------------------------------------------
Enter student ID: 
STU101
Enter student name: 
Ananya
Enter age: 
20
Age accepted.
Enter email: 
ananya@gmail.com

Select Course
1. BCA
2. B.Sc Computer Science
3. B.E/B. Tech
4. MCA
5. Other
Enter course choice: 
3
Course selected: B.E/B. Tech
Enter semester (1-8): 
4
Enter career goal: 
Become a Java Developer 
Enter Java marks: 
88
Enter SQL marks: 
82
Enter Web Technology marks: 
79
Enter Aptitude marks: 
76
Enter Communication marks: 
80
Enter total classes conducted: 
120
Enter classes attended: 
102
How many assignment scores do you want to enter (1-10): 
5
Enter score for assignment 1 (0-10, -1 to finish): 
8
Assignment score accepted.
Enter score for assignment 2 (0-10, -1 to finish): 
9
Assignment score accepted.
Enter score for assignment 3 (0-10, -1 to finish): 
7
Assignment score accepted.
Enter score for assignment 4 (0-10, -1 to finish): 
8
Assignment score accepted.
Enter score for assignment 5 (0-10, -1 to finish): 
9
Assignment score accepted.
Final payable fee: 47500.00
Enter fee paid: 
47500

========================================================
                 STUDENT SEMESTER REPORT
========================================================
Student ID                 : STU101
Student Name               : Anany
Age                        : 20
Email                      : ananya@gmail.com
Course                     : B.E/B. Tech
Semester                   : 4
Career Goal                : Become a Java Developer 

---------------- ACADEMIC SUMMARY --------------------
Java Marks                 : 88
SQL Marks                  : 82
Web Technology Marks       : 79
Aptitude Marks             : 76
Communication Marks        : 80
Total Marks                : 405/500
Percentage                 : 81.00%
Academic Result            : PASSED
Grade                      : A

---------------- ATTENDANCE SUMMARY ------------------
Classes Conducted          : 120
Classes Attended           : 102
Attendance Percentage      : 85.00%
Attendance Status          : REGULAR

---------------- ASSIGNMENT SUMMARY ------------------
Valid Assignments          : 5
Assignment Total           : 41
Assignment Average         : 8.20
Assignment Status          : SATISFACTORY

---------------- FEE SUMMARY -------------------------
Base Semester Fee          : 50000.00
Scholarship Percentage     : 5%
Scholarship Amount         : 2500.00
Final Payable Fee          : 47500.00
Fee Paid                   : 47500.00
Fee Balance                : 0.00
Fee Status                 : PAID

---------------- FINAL STATUS ------------------------
Semester Clearance         : CLEARED FOR NEXT SEMESTER

---------------- FAILED CONDITIONS -------------------
None

---------------- RECOMMENDATIONS ---------------------
Maintain the current performance in the next semester.
========================================================