package egoing;

public class ArrayApp {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0] = "nana";
        users[1] = "bibi";
        users[2] = "kiki";

        System.out.println(users[1]);
        System.out.println(users.length);

        int[] scores = {10, 100, 1000};
        System.out.println(scores[1]);
        System.out.println(scores.length);
    }
}
