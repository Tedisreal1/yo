import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        int c = 0;
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                n[c] = a[i];
                c++;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(n[i] + " ");
        }
    }
}