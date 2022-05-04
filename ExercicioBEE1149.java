import java.util.Scanner;

public class ExercicioBEE1149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int soma = 0;
        while (N <= 0) {
            N = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            soma += A;
            A++;
        }
        System.out.println(soma);
    }
}