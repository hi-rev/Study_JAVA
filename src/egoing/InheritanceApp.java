package egoing;

class Cal {
    int v1, v2;
    Cal (int v1, int v2) {
        System.out.println("Cal init!");
        this.v1 = v1;
        this.v2 = v2;
    }
    public int sum() {
        return this.v1 + this.v2;
    }
}

// Cal3 는 Cal 을 상속한다.
// 부모 클래스에 생성자가 있으면 자식 클래스에도 동일한 생성자를 생성해주어야 함
class Cal3 extends Cal {
    Cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3 init!");
    }
    public int minus() {
        return this.v1 - this.v2;
    }
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(2, 1);
        Cal3 c3 = new Cal3(2, 1);
        System.out.println(c3.sum());
        System.out.println(c3.minus());
    }
}
