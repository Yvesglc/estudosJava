import java.util.Scanner;

public class ExercicioBEE2846 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, res = 0;
        int a = sc.nextInt();
        for (int i = 4; cont != a; i++) {
            if (!isFib(i)) {
                cont++;
                res = i;
            }
        }
        System.out.println(res);
    }

    private static boolean square(long x) {
        long s = (long) Math.sqrt(x);
        return s * s == x;
    }

    private static boolean isFib(long c) {
        return (square(5 * c * c + 4) || square(5 * c * c - 4));
    }

}