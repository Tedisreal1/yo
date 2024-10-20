import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] A = new int[n][];
        for (int i = 0; i < n; i++) {
            A[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                A[i][j] = in.nextInt();
            }
        }
        int res = wtf(A);
        System.out.println(res);
    }
    private static int wtf(int[][] A) {
        for (int i = A.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                A[i][j] += Math.max(A[i + 1][j], A[i + 1][j + 1]);
            }
        }
        return A[0][0];
    }
}