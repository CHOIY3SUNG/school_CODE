public class DataTypeExam {
    public static void main(String[] args) {
        // int a = 2147483648; // 4byte int형이 표현할 수 있는 수의 범위를 넘어서서 컴파일 오류가 일어남
        int b = 2147483647;
        int c = 1;
        int result = b + c;         // 오버플로우 발생
        System.out.println(result); // 엉뚱한 결과가 출력됨
    }
}
