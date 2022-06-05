import java.util.Scanner;

public class ExercicioBEE2718 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            long X = sc.nextLong();
            int sequenciaMaxima = 0;
            int sequenciaAtual = 0;

            while (X > 0) {

                if (X % 2 == 1) {
                    sequenciaAtual++;

                } else {
                    if (sequenciaAtual > sequenciaMaxima) {
                        sequenciaMaxima = sequenciaAtual;
                    }
                    sequenciaAtual = 0;
                }
                X /= 2;
            }

            if (sequenciaAtual > sequenciaMaxima) {
                sequenciaMaxima = sequenciaAtual;
            }

            System.out.println(sequenciaMaxima);
        }
    }

}