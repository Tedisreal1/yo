import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rotate = 0;
        while (n > 0) {
            int digit = n % 10;
            rotate = rotate * 10 + digit;
            n /= 10;
        }
        System.out.println(rotate);
    }
}