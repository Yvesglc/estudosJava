import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double cod1 = 4.00;
        double cod2 = 4.50;
        double cod3 = 5.00;
        double cod4 = 2.00;
        double cod5 = 1.50;

        switch (cod) {
            case 1:
                System.out.printf("Total: R$ %.2f%n", qtd * cod1);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f%n", qtd * cod2);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f%n", qtd * cod3);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f%n", qtd * cod4);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f%n", qtd * cod5);
                break;
            default:
                ;

        }
    }
}
