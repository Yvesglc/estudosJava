import java.util.Scanner;

public class ExercicioBEE1961 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();
        int pulos[] = new int[N];
        boolean WIN = true;

        for (int i = 0; i < N; i++) {
            pulos[i] = sc.nextInt();
        }

        for (int i = 0; i < (N - 1); i++) {
            if ((pulos[i] - pulos[i + 1]) < (-P)) WIN = false;
            else if ((pulos[i] - pulos[i + 1]) > P) WIN = false;
        }

        if (WIN) System.out.println("YOU WIN");
        else System.out.println("GAME OVER");
    }

}