package egoing;

class Greeting {
    // public 이란 무엇인가?
    // protected, default, private 등등 사용 가능
    // private ==> 이 메소드를 다른 클래스에서 사용하려고 하면 error
    // public ==> 다른 클래스에서도 사용 가능!
    public static void hi() {
        System.out.println("Hi");
    }
}

public class AccessLevelModifiersMethod {
    public static void main(String[] args) {
        Greeting.hi();
    }
}
