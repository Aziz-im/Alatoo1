package Lesson6;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private int course;
    private int credits;

    public Student(String id, String name, int course) {
        this.id = id;
        this.name = name;
        setCourse(course);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getCourse() { return course; }
    public int getCredits() { return credits; }

    public void setName(String name) { this.name = name; }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) this.course = course;
        else this.course = 1;
    }

    public void addCredits(int amount) {
        if (amount > 0) credits += amount;
    }

    public boolean nextCourse() {
        if (course < 4 && credits >= course * 60) {
            course++;
            return true;
        }
        return false;
    }

    public void printInfo() {
        System.out.println(id + " | " + name + " | " + course + " курс | " + credits + " кредитов");
    }
}

class University {
    private String name;
    private int maxStudents;
    private ArrayList<Student> students = new ArrayList<>();

    public University(String name, int maxStudents) {
        this.name = name;
        setMaxStudents(maxStudents);
    }

    public String getName() { return name; }
    public int getMaxStudents() { return maxStudents; }

    public void setName(String name) { this.name = name; }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents > 0) this.maxStudents = maxStudents;
        else this.maxStudents = 10;
    }

    public void addStudent(Student s) {
        if (students.size() < maxStudents) students.add(s);
        else System.out.println("Нет мест");
    }

    public Student findStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    public void removeStudent(String id) {
        students.remove(findStudent(id));
    }

    public void printAll() {
        System.out.println(name + ": " + students.size() + "/" + maxStudents);
        for (Student s : students) s.printInfo();
    }
}

public class intro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Университет: ");
        String uniName = sc.nextLine();
        System.out.print("Мест: ");
        University uni = new University(uniName, sc.nextInt());

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n1-Добавить 2-Кредиты 3-Перевести 4-Отчислить 5-Список 0-Выход");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("ID, имя, курс: ");
                uni.addStudent(new Student(sc.next(), sc.next(), sc.nextInt()));
            } else if (choice >= 2 && choice <= 4) {
                System.out.print("ID: ");
                Student s = uni.findStudent(sc.nextLine());
                if (s == null) {
                    System.out.println("Не найден");
                } else if (choice == 2) {
                    System.out.print("Кредиты: ");
                    s.addCredits(sc.nextInt());
                } else if (choice == 3) {
                    System.out.println(s.nextCourse() ? "Переведён" : "Мало кредитов");
                } else {
                    uni.removeStudent(s.getId());
                }
            } else if (choice == 5) {
                uni.printAll();
            }
        }
        sc.close();
    }
}