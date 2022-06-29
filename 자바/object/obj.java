package object;

public class obj {
    public static void main(String[] args) {
        Dent kim = new Dent();
        Dent choi = new Dent("최예성");
        Dent jin = new Dent("최진양", 3);
        System.out.println("학생의 이름은 " + kim.name + "입니다.");
        System.out.println("학생의 이름은 " + choi.name + "입니다.");
        System.out.println("학생의 이름은 " + jin.name + "이고," + jin.grade + "학년입니다" );
    }
}

class Dent {
    String name;
    int grade;
    int ban;
    int num;
    String telephone;
    public Dent() { }
    public Dent(String name) {
        this.name = name;
    }
    public Dent( String name, int grade ) {
        this(name);
        this.grade = grade;
    }
}