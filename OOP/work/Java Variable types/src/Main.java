class Course {

    // Instance variables
    // Each object has its own copy
    String courseName;
    int registeredStudents;
    int lectureid;

    // Static variable
    // Shared by all Course objects
    static int totalStudents = 0;
    double uniAttendenceAvg;
    // Constructor
    Course(int L,String cn, int rs) {
        this.courseName = cn;
        this.registeredStudents = rs;
        lectureid = L;

        // Add students to the university-wide total
        totalStudents += registeredStudents;
    }

    // Method to display individual course statistics
    void displayCourseStatistics() {

        // Local variable
        double passPercentage = 85.0;

        System.out.println("Course Name: " + courseName);
        System.out.println("Registered Students: " + registeredStudents);
        System.out.println("Pass Percentage: " + passPercentage + "%");
        System.out.println();
    }

    // Method for temporary attendance calculation
    void calculateAverageAttendance() {

        // Local variables
        int studentsPresent = registeredStudents - 10;

        double averageAttendance = (studentsPresent * 100.0) / registeredStudents;

        System.out.println("Course: " + courseName);
        System.out.println("Average Attendance: " + averageAttendance + "%");
        System.out.println();
    }

    // Static method to display university statistics
    static void displayUniversityStatistics() {
        System.out.println("===== UNIVERSITY STATISTICS =====");
        System.out.println("Total Registered Students: " + totalStudents);
    }
}


public class Main {

    public static void main(String[] args) {

        // Creating three Course objects
        Course course1 = new Course(01,"Data Structures and Algorithms", 40);

        Course course2 = new Course(02,"Object Oriented Programming", 35);

        Course course3 = new Course(03,"Computer Networks", 30);

        // Display individual course statistics
        System.out.println("===== COURSE STATISTICS =====");

        course1.displayCourseStatistics();
        course2.displayCourseStatistics();
        course3.displayCourseStatistics();

        // Temporary calculations
        System.out.println("===== ATTENDANCE =====");

        course1.calculateAverageAttendance();
        course2.calculateAverageAttendance();
        course3.calculateAverageAttendance();

        // Display university-wide statistics
        Course.displayUniversityStatistics();
    }
}