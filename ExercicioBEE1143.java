import java.util.Scanner;

public class ExercicioBEE1143 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }
    }

}