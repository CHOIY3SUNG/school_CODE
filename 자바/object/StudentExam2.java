package object;

import java.sql.Struct;

class Student2 {
    private String name;
    private int grade;
    public Student2() { }
    public Student2(String name) { this.name = name; }
    public Student2(String name, int grade) {
        this(name);
        this.grade = grade;
    }
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    public void setGrade(int grade) { this.grade = grade; }
    public int getGrade() { return this.grade; }
}

public class StudentExam2 {
    public static void main(String[] args) {
        Student2 ye = new Student2("yesung");
        ye.setGrade(2);
        Student2 jin = new Student2("jinyang", 2);
        System.out.println("학생의 이름은 " + ye.getName() + "이고, " + ye.getGrade() + "학년입니다.");
        System.out.println("학생의 이름은 " + jin.getName() + "이고, " + jin.getGrade() + "학년입니다.");
    }
}
