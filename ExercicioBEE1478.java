import java.util.Scanner;

public class ExercicioBEE1478 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x;
        while (N != 0) {
            for (int i = 1; 1 <= N; i++) {
                x = i;
                for (int j = 1; j <= N; j++) {
                    if (i == j) x = 1;

                    System.out.printf("%3d", x);
                    if (j < N) {

                    }
                }
            }
        }
    }
}