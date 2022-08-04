import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n;
        int a, b, cnt = 0;

        while (true) {
            a = n / 10;
            b = n % 10;
            n = b*10 + ((a+b) % 10);
            cnt += 1;
            if (res == n) {
                System.out.println(cnt);
                break;
            }
        }
    }
}