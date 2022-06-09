import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2775 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.nextLine());

            String entrada1 = sc.nextLine();
            String[] entr1 = entrada1.split(" ");
            int[] numPac = new int[N];
            for (int i = 0; i < N; i++)
                numPac[i] = Integer.parseInt(entr1[i]);


            String entrada2 = sc.nextLine();
            String[] entr2 = entrada2.split(" ");
            int[] tempo = new int[N];
            for (int i = 0; i < N; i++)
                tempo[i] = Integer.parseInt(entr2[i]);


            int custo = 0;
            int auxp = 0;
            int auxs = 0;

            boolean fim = true;
            while (fim) {
                int aux = custo;
                for (int i = 0; i < N - 1; i++) {
                    if (numPac[i] > numPac[i + 1]) {

                        auxp = numPac[i];
                        numPac[i] = numPac[i + 1];
                        numPac[i + 1] = auxp;

                        auxs = tempo[i];
                        tempo[i] = tempo[i + 1];
                        tempo[i + 1] = auxs;

                        custo += tempo[i] + tempo[i + 1];
                    }
                }
                if (aux == custo) {
                    System.out.println(custo);
                    fim = false;
                }
            }
        }
        sc.close();
    }
}