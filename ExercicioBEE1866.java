import java.util.Scanner;

public class ExercicioBEE1866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int N, X;
        for (int i = 0; i < C; i++) {
            N = sc.nextInt();
            X = 0;
            for (int j = 0; j < N; j++) {
                if (j % 2 == 0) X++;
                else X--;
            }
            System.out.println(X);
        }
    }

}