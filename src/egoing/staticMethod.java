package egoing;

class Print {
    public String delimiter;

    // static 이 없으면 메소드는 클래스의 소속이 아니라 인스턴스의 소속
    public void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}

public class staticMethod {


    public static void main(String[] args) {
        Print t1 = new Print();  // 객체1
        t1.delimiter = "-";
        t1.a();
        t1.b();

        Print t2 = new Print();  // 객체2
        t2.delimiter = "*";
        t2.a();
        t2.b();
    }
}
