//package Lesson6;
//
//class Student {
//    public String studentId;
//    public String name;
//    private double gpa;
//
//    public Student(String studentId, String name, double gpa) {
//        this.studentId = studentId;
//        this.name = name;
//        this.gpa = 0.0;
//        setGpa(gpa);
//    }
//
//    public boolean setGpa(double newGpa) {
//        if (newGpa >= 0.0 && newGpa <= 4.0) {
//            this.gpa = newGpa;
//            System.out.printf(" GPA updated to %.2f%n", newGpa);
//            return true;
//        } else {
//            System.out.printf("2 Invalid GPA: %.2f (allowed 0.0-4.0). GPA unchanged: %.2f%n",
//                    newGpa, this.gpa);
//            return false;
//        }
//    }
//
//    public void displayStudentInfo() {
//        System.out.println("+-------- STUDENT CARD --------+");
//        System.out.printf("| ID   : %-21s |%n", studentId);
//        System.out.printf("| Name : %-21s |%n", name);
//        System.out.printf("| GPA  : %-21s |%n", String.format("%.2f / 4.00", gpa));
//        System.out.println("+------------------------------+");
//    }
//}
//
//
//public class into {
//    public static void main(String[] args) {
//        System.out.println("=== Task 2: Creating students ===");
//        Student student1 = new Student("S101", "Alice", 3.8);
//        Student student2 = new Student("S102", "Bob", 2.9);
//        student1.displayStudentInfo();
//        student2.displayStudentInfo();
//
//        System.out.println("\n=== Task 3: Direct access to private gpa ===");
//        System.out.println("student1.gpa = 5.5; -> compile error: gpa has private access in Student");
//        student1.displayStudentInfo();
//
//        System.out.println("\n=== Task 4: setGpa(5.5) ===");
//        student1.setGpa(5.5);
//        student1.displayStudentInfo();
//
//        System.out.println("\n=== Task 5: setGpa(3.9) ===");
//        student1.setGpa(3.9);
//        student1.displayStudentInfo();
//    }
//}