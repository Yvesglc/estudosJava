import java.util.Scanner;

public class ExercicioBEE1116 {

    public static void main(String[] args) {
        int N;
        int X, Y;
        float result;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            X = sc.nextInt();
            Y = sc.nextInt();
            if (Y == 0) {
                System.out.print("divisao impossivel\n");
            } else {
                result = (float) X / Y;
                System.out.printf("%.1f\n", result);
            }

        }
    }
}