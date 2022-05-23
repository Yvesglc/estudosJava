import java.util.Scanner;

public class ExercicioBEE1165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X, cont;
        for (int i = 0; i < N; i++) {
            cont = 0;
            X = sc.nextInt();
            for (int j = 2; j < X; j++) {
                if (X % j == 0) cont++;
            }
            if (cont == 0) System.out.println(X + " eh primo");
            else System.out.println(X + " nao eh primo");
        }
    }

}