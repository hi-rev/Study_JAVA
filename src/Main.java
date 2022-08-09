// 셀프 넘버
// 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수
public class Main {
    public static void main(String[] args) {
        int n = 10000;
        boolean[] idx = new boolean[n + 1];  // index 10000 까지의 배열 생성

        for (int i = 0; i < n + 1; i++) {
            if (d(i) < n + 1) {
                idx[d(i)] = true;  // 셀프 넘버가 아닌 것
            }
        }

        for (int i = 0; i < n + 1; i++) {
            if (!idx[i]) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int res = n;

        while (n != 0) {
            res += n % 10;
            n = n / 10;
        }
        return res;
    }
}


