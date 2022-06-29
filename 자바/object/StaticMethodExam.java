package object;

public class StaticMethodExam {
    public static void main(String[] args) {
        Student3 ye = new Student3();
        Student3 jin = new Student3();
        Student3 jo = new Student3();
        System.out.println("생성된 학생 객체 수는 " + Student3.getCount() + "입니다.");
    }
}

class Student3 {
    String name;
    int grade;
    static int count = 0;
    public Student3() { count++; }
    public static int getCount() { return count ;}
}