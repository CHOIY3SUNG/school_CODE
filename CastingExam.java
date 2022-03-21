public class CastingExam {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;      // int b = (int)a; 자동이므로 생략
        System.out.println(a);
        System.out.println(b);
    }
}
