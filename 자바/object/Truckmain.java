package object;

class Car{
    String carname;
    String color="검정색";
    String company;
    int velocity;
    void speedUp(){
        velocity += 5;
    }
    void speedDown(){
        velocity -= 5;
    }
}
class Truck extends Car {
    int ton;
    void takeoff() {}
    void takeon() {}
}
public class Truckmain {
    public static void main(String[] args) {
        Truck mytruck = new Truck();
        mytruck.carname = "프론티어";
        mytruck.ton = 3;
        System.out.println("나의 트럭은 " + mytruck.color + "이다.");
        System.out.println(mytruck.carname+"는 "+mytruck.ton +"톤을 실을 수 있다");
    }
}
