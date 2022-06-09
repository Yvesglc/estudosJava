import java.util.Scanner;

public class ExercicioBEE2879 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int vitorias = 0;
        for (int i=0; i<n; i++) {
            if (sc.nextInt() != 1) vitorias++;
        }
        System.out.println(vitorias);
    }
}
