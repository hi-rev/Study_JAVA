import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int a = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
                idx = i;
            }
        }
        System.out.println(a);
        System.out.println(idx + 1);
    }
}

