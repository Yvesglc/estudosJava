import java.util.Scanner;

public class ExercicioBEE1078 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " x " + N + " = " + (i * N) + "\n");
        }

    }

}