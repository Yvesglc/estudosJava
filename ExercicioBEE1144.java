import java.util.Scanner;

public class ExercicioBEE1144 {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = i, k = (j * i), l = (k * j); j == i; j++) {
                System.out.print(j + " " + k + " " + l + "\n");
                System.out.print(j + " " + (k + 1) + " " + (l + 1) + "\n");
            }
        }

    }

}