import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float N1, N2, N3, N4, media, N5, mediafinal;
        Scanner sc = new Scanner(System.in);
        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();

        media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if (media >= 7.0) {

            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno aprovado.%n");

        } else if (media >= 5.0 && media <= 6.9) {

            N5 = sc.nextFloat();
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno em exame.%n");
            System.out.printf("Nota do exame: %.1f%n", N5);
            mediafinal = (media + N5) / 2;

            if (mediafinal >= 5.0) {
                System.out.printf("Aluno aprovado.%n");

            } else {
                System.out.printf("Aluno reprovado.%n");

            }

            System.out.printf("Media final: %.1f%n", mediafinal);

        } else if (media < 5.0) {

            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno reprovado.%n");

        }
    }

}