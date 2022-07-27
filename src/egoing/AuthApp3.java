package egoing;

public class AuthApp3 {
    public static void main(String[] args) {
        // 유저 배열 생성
        // String[] users = {"nana", "haha", "lili"};
        String[][] users = {
                {"nana", "1111"},
                {"haha", "2222"},
                {"lili", "3333"}
        };
        String inputId = args[0];
        String inputPass = args[1];

        boolean isLogined = false;
        for (int i = 0; i < users.length; i++) {
            String currentId = users[i][0];
            String currentPass = users[i][1];
            if (currentId.equals(inputId) && (currentPass.equals(inputPass))) {
                isLogined = true;
                break;
            }
        }
        System.out.println("Hi, ");
        if (isLogined) {
            System.out.println("Master!!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
