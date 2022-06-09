import java.util.HashSet;
import java.util.Scanner;

public class ExercicioBEE2783 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int M = sc.nextInt();
        int faltam = 0;
        HashSet<Integer> carimbadas = new HashSet<>();
        HashSet<Integer> compradas = new HashSet<>();
        for (int i = 0; i < C; i++)
            carimbadas.add(sc.nextInt());
        for (int i = 0; i < M; i++)
            compradas.add(sc.nextInt());
        for (int i : carimbadas)
            if (!compradas.contains(i)) faltam++;
        System.out.println(faltam);
    }

}