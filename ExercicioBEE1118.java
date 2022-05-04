import java.util.Scanner;

public class ExercicioBEE1118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, flag = 1;
        while (flag == 1) {

            nota1 = sc.nextDouble();
            while (nota1 > 10 || nota1 < 0) {
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }

            nota2 = sc.nextDouble();
            while (nota2 > 10 || nota2 < 0) {
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }

            double media = (nota1 + nota2) / 2;
            System.out.println(String.format("media = %.2f", media));

            System.out.println("novo calculo (1-sim 2-nao)");
            flag = sc.nextInt();
            while (flag != 1 && flag != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                flag = sc.nextInt();
            }
        }
    }
}
	