import java.util.Scanner;

public class ExercicioBEE2867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int digitos = (int) (Math.log10(Math.pow(n1, n2)) + 1);
            System.out.println(digitos);
        }
    }
}
