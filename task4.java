import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        if (t4(first, second)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        in.close();
    }
    private static boolean t4(String str1, String str2) {
        String A = str1.replaceAll("\s+", "").toLowerCase();
        String B = str2.replaceAll("\s+", "").toLowerCase();
        if (A.length() != B.length()) {
            return false;
        }
        int[] N = new int[26];
        for (int i = 0; i < A.length(); i++) {
            N[A.charAt(i) - 'a']++;
            N[B.charAt(i) - 'a']--;
        }
        for (int count : N) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}