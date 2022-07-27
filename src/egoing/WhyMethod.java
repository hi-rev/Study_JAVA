package egoing;

public class WhyMethod {
    public static void main(String[] args) {
        printTwoTimes("a", "--");
        printTwoTimes("a", "*");
        printTwoTimes("a", "&");
        printTwoTimes("b", "!");
    }

    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}
