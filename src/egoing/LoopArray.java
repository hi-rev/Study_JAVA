package egoing;

public class LoopArray {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0] = "nana";
        users[1] = "bibi";
        users[2] = "kiki";

        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.println(users[i] + ", ");
            } else {
                System.out.println(users[i]);
            }
        }
    }
}
