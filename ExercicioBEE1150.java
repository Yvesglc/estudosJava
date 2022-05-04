import java.util.Scanner;

public class ExercicioBEE1150 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X, Z, p = 0, sum = 0;
        X = sc.nextInt();
        Z = sc.nextInt();
        while (X >= Z) {
            Z = sc.nextInt();
        }
        for (int i = X; i < Z; i++) {
            sum = sum + i;
            p++;
            if (sum > Z) {
                break;
            }
        }
        System.out.println(p);

    }

}