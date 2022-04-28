import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int ano = a / 365;
        a = a % 365;
        int mes = a / 30;
        a = a % 30;
        int dia = a;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}
