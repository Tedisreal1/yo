import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder compress = new StringBuilder();
        char sj = input.charAt(0);
        int c = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == sj) {
                c++;
            } else {
                compress.append(sj).append(c);
                sj = input.charAt(i);
                c = 1;
            }
        }
        compress.append(sj).append(c);
        System.out.println(compress.toString());
    }
}