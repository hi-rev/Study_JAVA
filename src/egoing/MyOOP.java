package egoing;

// 파일과 같은 이름의 클래스에는 public 을 붙인다.
public class MyOOP {
    // 클래스 전역 변수로 delimiter 선언
    public static void main(String[] args) {
        // 객체(Object): 소프트웨어 세계에 구현할 대상
        // 클래스(Class): 이를 구현하기 위한 설계도
        // 인스턴스(Instance): 소프트웨어 세계에 구현된 실체
        // 객체1
        Print2 p1 = new Print2("----");
        p1.A();
        p1.B();

        // 객체2
        Print2 p2 = new Print2("****");
        p2.A();
        p2.B();
    }
}

