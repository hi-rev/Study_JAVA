package egoing;

public class OutputMethod {
    // 문자열로 반환하기 때문에 String 메소드 선언
    public static String a() {
        return "a";
    }

    // 정수로 반환하기 때문에 int 메소드 선언
    public static int one() {
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(a());
        System.out.println(one());
    }
}
