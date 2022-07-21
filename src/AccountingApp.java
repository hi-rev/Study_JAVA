public class AccountingApp {
    public static void main(String[] args) {
        double valueOfSupply = 15000.0;  // 공급가액
        double vatRate = 0.1;  // 세금 비율
        double expenseRate = 0.3;  // 비용 비율
        double vat = valueOfSupply * vatRate;  // 세금
        double total = valueOfSupply + vat;  // 판매가액
        double expense = valueOfSupply * expenseRate;  // 비용
        double income = valueOfSupply - expense;  // 수익

        System.out.println("Value Of Supply: " + valueOfSupply);
        System.out.println("VAT: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        // 수익이 10000원 이하이면 1번이 모두 가지고,
        // 수익이 10000원 초과이면 5:3:2 비율로 나눈다.
        if (income > 10000.0) {
            int i = 0;
            while (i < dividendRates.length) {
                System.out.println("Dividend " + (i+1) + ": " + (income * dividendRates[i]));
                i += 1;
            }
        } else {
            System.out.println("Dividend 1: " + income);
            System.out.println("Dividend 2: " + 0.0);
            System.out.println("Dividend 3: " + 0.0);
        }
    }
}
