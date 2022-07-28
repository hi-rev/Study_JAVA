package egoing;
// static 이 있는 것 : 클래스의 소속
// static 이 없는 것 : 인스턴스의 소속
class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void classMethod() {  // 클래스 메소드
        // 클래스 메소드는 클래스 변수만 접근 가능하고, 인스턴스 변수는 접근 X
        System.out.println(classVar);
//        System.out.println(instanceVar);
    }
    public void instanceMethod() {  // 인스턴스 메소드
        // 인스턴스 메소드는 둘 다 접근 가능
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
}

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);  // I class var : 클래스를 통해 호출 가능
//        System.out.println(Foo.instanceVar); // error
        Foo.classMethod();
//        Foo.instanceMethod();
        // 클래스를 통해서 인스턴스 변수나 메소드로 접근하는 것은 금지되어 있다.
        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar);  // I class var
        System.out.println(f1.instanceVar);  // I instance var

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar);  // changed by f1
        System.out.println(f2.classVar);  // changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);  // changed by f1
        System.out.println(f2.instanceVar);  // I instance var
    }
}
