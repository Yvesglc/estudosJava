import java.util.Scanner;

public class ExercicioBEE2823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int p = sc.nextInt();
            cnt += c / p;
        }
        if (cnt > 1)
            System.out.println("FAIL");
        else
            System.out.println("OK");
    }
}
