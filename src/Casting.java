public class Casting {
    public static void main(String[] args) {
        double a = 1.1;  // 실수 자료형
        double b = 1;  // 정수를 입력했지만 실수 자료형으로 반환하게 된다.

        // 데이터의 형 변환을 Casting 이라고 한다.
        int c = (int) 1.1;  // 실수 -> 정수
        String d = Integer.toString(1);  // 정수 -> 문자열
    }
}
