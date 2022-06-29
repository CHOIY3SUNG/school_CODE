package object;

class Studentmake{
    String name;
    String hakbun;
    String phone;
    String juso;
    String major;
    public Studentmake() {}
    public Studentmake(String name, String hakbun) {
        this.name = name;
        this.hakbun = hakbun;
    }
    public void study(){ System.out.println("공부하다."); }
    public void eat(){ System.out.println("식사하다."); }
    public void test(){ System.out.println("시험보다."); }
    public void extra_act(){ System.out.println("동아리 활동하다."); }
}

class Leader extends Studentmake {
    boolean leader;
    public Leader() {}
    public Leader(String name, String hakbun, boolean leader) {
        this.name = name;
        this.hakbun = hakbun;
        this.leader = leader;
    }
    public void hello(){
        System.out.println("인사하다");
    }
    public void boss(){
        if(leader){
            System.out.println(name + "은 학급회장이다");
        } else {
            System.out.println(name + "은 학급회장이 아니다");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        Leader yes = new Leader("최예성", "2120", true);
        yes.boss();
    }
}
