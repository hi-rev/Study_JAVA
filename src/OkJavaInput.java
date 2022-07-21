import javax.swing.*;
import java.util.Scanner;

public class OkJavaInput {
    // args : 스트링타입 인자로만 채워진 list
    public static void main(String[] args) {
        // 입력된 값이 id로 저장된다.
        String id = JOptionPane.showInputDialog("Enter a ID");
        System.out.println(id);

        // java input
        // System.in : 입력한 값을 바이트 단위로 읽는다.
        Scanner sc = new Scanner(System.in);
        // sc.nextInt() : 값은 int 로 넘겨주겠다.
        int num = sc.nextInt();
        System.out.println(num);
    }
}
