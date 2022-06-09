import java.util.Locale;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExercicioBEE2779 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> X = new LinkedHashSet<>();
        for (int i = 0; i < M; i++)
            X.add(sc.nextInt());
        System.out.println(N - X.size());

        sc.close();
    }
}