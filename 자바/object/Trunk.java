package object;

class Car2 {
    Car2(){ }
    Car2(String name){
        System.out.println("차 이름이 있는 생성자");
    }
}

class Trunk extends Car2 {
    Trunk(){
        super("SM3");
        System.out.println("Trunk 생성자");
    }
    public static void main(String[] args) {
        Trunk mytrunk = new Trunk();
    }
}
