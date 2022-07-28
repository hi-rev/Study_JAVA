package egoing;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    public static void main(String[] args) throws IOException {
        // class: System, Math, FileWriter
        // instance: f1, f2
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));

        // 파일을 기록할 때 사용하는 클래스
        // f1, f2는 FileWriter 의 복제본
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" OOP");
        f2.close();
    }
}
