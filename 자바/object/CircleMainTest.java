package object;

class CircleArea_Exam{
    public double area(int r) {
        return 3.14 * r * r;
    }
    protected double round(int r) {
        return 2 * 3.14 * r;
    }
}

public class CircleMainTest {
    public static void main(String[] args) {
        CircleArea_Exam cp = new CircleArea_Exam();
        System.out.println("원의 면적은 " + cp.area(10));
        System.out.println("원의 둘레는 " + cp.round(10));
    }
}
