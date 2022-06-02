import java.util.Scanner;

public class ExercicioBEE2161 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double x = 0.0;
        for (int i = 0; i < N; i++) {
            x += 6.0;
            x = (1.0 / x);
        }
        x += 3.0;
        System.out.println(String.format("%.10f", x));
    }

}