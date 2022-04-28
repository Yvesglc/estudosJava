import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int func = sc.nextInt();
        int hora = sc.nextInt();
        double valor = sc.nextDouble();

        double salario = hora * valor;

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        }
    }
