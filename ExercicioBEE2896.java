import java.util.Scanner;

public class ExercicioBEE2896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println((N % K) + (N / K));
        }
    }
}
