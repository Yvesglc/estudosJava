import java.util.Scanner;

public class ExercicioBEE1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, y, somaimpar = 0, contaimpar;

        n = sc.nextInt();
        while (n > 0) {

            x = sc.nextInt();
            y = sc.nextInt();

            if (x % 2 == 1) {
                for (contaimpar = x; contaimpar <= x + 1 + ((y - 1) * 2); contaimpar += 2) {
                    somaimpar += contaimpar;
                }
                System.out.println(somaimpar);
            } else {
                for (contaimpar = x + 1; contaimpar <= x + 1 + ((y - 1) * 2); contaimpar += 2) {
                    somaimpar += contaimpar;
                }
                System.out.println(somaimpar);
            }

            somaimpar = 0;
            n = n - 1;
        }
        sc.close();
    }
}
