package egoing;

public class AuthApp {
    public static void main(String[] args) {
        // Edit Configuration에서 args 값을 주었다.
        String id = "nana";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi!");

        // if (inputId == id) {
        if (inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you");
        }
    }
}

// edit configuration 에서 준 String 값이랑 변수에 저장한 동일한 String 값이 같지 않다.
// inputId == id 는 false, inputId.equals(id) 는 true





