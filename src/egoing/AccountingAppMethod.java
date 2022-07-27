package egoing;

public class AccountingAppMethod {
    public static double valueOfSupply = 10000.0;  // 공급가액
    public static double vatRate = 0.1;  // 부가가치세율

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    public static void main(String[] args) {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
    }
}
