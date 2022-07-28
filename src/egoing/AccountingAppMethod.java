package egoing;

class Accounting {  // 회계 class
    // 관련된 것들끼리 묶어서 class 를 만들어주면 각각이 어떤 역할을 하는지 좀 더 편리하게 활용할 수 있다.
    // 변하지 않는 값을 static 으로 설정하면 객체를 설정할 때마다 메모리를 낭비하지 않게 해준다.
    // (인스턴스가 아닌 class 에 저장되어 있기 때문)
    public double valueOfSupply;  // 공급가액
    public static double vatRate = 0.1;  // 부가가치세율

    // 객체를 생성할 때 기본 인자값을 넣어서 설정하고 싶을 때
    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }

    public double getVAT() {
        return valueOfSupply * vatRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingAppMethod {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);  // 객체1
        Accounting a2 = new Accounting(20000.0);  // 객체2

        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);

        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());

        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());

    }
}
