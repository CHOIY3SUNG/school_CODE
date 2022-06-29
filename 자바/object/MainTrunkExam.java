package object;

class Car3{
    String carname;
    String color;
    int velocity;
    void speedUp(){
        velocity += 5;
        System.out.println("속도 " +velocity + " 증가");
    }
    void speedDown(){
        velocity -= 5;
        System.out.println("속도 " +velocity + " 감소");
    }
}

class Truck3 extends Car3{
    int ton = 5;
    void speedUp(){
        velocity += 10;
        System.out.println("속도 " +velocity + " 증가");
    }
    void speedDown(int num){
        velocity -= 5;
        System.out.println("속도 " +velocity + " 감소");
    }
}

class MainTruckExam{
    public static void main(String[] args){
        Truck3 mytruck = new Truck3();
        mytruck.speedUp();
        mytruck.speedDown();
    }
}