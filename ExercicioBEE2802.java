import java.util.Scanner;

public class ExercicioBEE2802 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double resposta = (Math.pow(N, 4.0) - (6.0 * Math.pow(N, 3.0)) + (23.0 * Math.pow(N, 2.0)) - (18.0 * N) + 24.0) / 24.0;
        System.out.printf("%.0f%n", resposta);
    }

}