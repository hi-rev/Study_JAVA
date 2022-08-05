import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();  // test case
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();  // 학생의 수
            int[] std = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {  // 학생 점수 입력
                std[j] = sc.nextInt();
                sum += std[j];  // 총점
            }
            int mean = sum / n;  // 평균값
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (std[j] > mean) {
                    cnt++;
                }
            }
            System.out.printf("%.3f", (double)cnt/n * 100);
            System.out.println("%");
        }
    }
}

