import java.util.Scanner;

// 단어 공부
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 각 문자들의 빈도수를 나타내기 위한 배열을 선언
        int[] arr = new int[26];
        String s = sc.next();  // 문자
        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 65]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 숫자를 대문자로 바꿈
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
