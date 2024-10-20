import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] parts = input.split(" ");
        int d = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);
        String weekday = wtf(d, m, y);
        System.out.println(weekday);
    }
    private static String wtf(int d, int m, int y) {
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int f = d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j);
        int wkday = f % 7;
        String[] D = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return D[wkday];
    }
}