package object;

public class MoverLoadingExam {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.sum("한세", "사이버보안"));
        System.out.println(a.sum(10, 20));
    }
}
class Add {
    String sum(String s1, String s2) {
        return s1 + s2;
    }
    int sum(int i1, int i2) {
        return i1 + i2;
    }
}
