public class Course {

    String courseName;                    // Instance variable
    int registeredStudents;              // Instance variable
    static int totalStudents = 0;        // Static variable

    Course(String courseName, int registeredStudents) {
        this.courseName = courseName;
        this.registeredStudents = registeredStudents;
        totalStudents += registeredStudents;
    }

    void displayStatistics(int attendedStudents) {
        double attendancePercentage =
                (attendedStudents * 100.0) / registeredStudents; // Local variable

        System.out.println("Course: " + courseName);
        System.out.println("Registered Students: " + registeredStudents);
        System.out.printf("Attendance: %.2f%%%n", attendancePercentage);
        System.out.println();
    }

    static void displayUniversityStatistics() {
        System.out.println(
                "Total Students Across All Courses: " + totalStudents
        );
    }

    public static void main(String[] args) {

        Course oop = new Course(
                "Applied Object-Oriented Programming", 45);

        Course networks = new Course(
                "Computer Networks", 40);

        Course algorithms = new Course(
                "Data Structures & Algorithms", 35);

        oop.displayStatistics(42);
        networks.displayStatistics(36);
        algorithms.displayStatistics(30);

        displayUniversityStatistics();
    }
}