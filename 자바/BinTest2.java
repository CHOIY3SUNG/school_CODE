public class BinTest2 {
    public static void main(String[] args) {
        int num1 = 0B00000000000000000000000000000101;
        int num2 = 0B11111111111111111111111111111011;

        int sum = num1 + num2;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);
    }
}
