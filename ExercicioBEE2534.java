import java.util.*;

public class ExercicioBEE2534 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] ns = new int[n];
            int[] saida = new int[q];
            List<Integer> lista = new ArrayList<Integer>();

            for (int i = 0; i < n; i++)
                lista.add(sc.nextInt());

            Collections.sort(lista);

            Collections.reverse(lista);

            for (int i = 0; i < q; i++)
                saida[i] = sc.nextInt();

            for (int i = 0; i < q; i++)
                System.out.println(lista.get(saida[i] - 1));
        }
        sc.close();
    }
}