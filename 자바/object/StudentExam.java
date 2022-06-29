package object;

class Student{
    String name;
    int grade;
    public Student(String name) { this.name = name; }
    public Student(String name, int grade) {
        this(name);
        this.grade = grade;
    }
    public void print() {
        System.out.println("학생의 이름은 " + this.name + "이고, " + this.grade + "학년입니다.");
    }
}

public class StudentExam {
    public static void main(String args[]) {
        Student ye = new Student("최예성");
        ye.grade = 2;
        Student jin = new Student("최진양", 3);
        ye.print();
        jin.print();
    }
}
