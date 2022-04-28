import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1012 {
    public static void main(String[] args) {
        Locale .setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double trianguloRetangulo = A * C / 2;
        double circulo = pi * Math.pow(C, 2);
        double trapezio = (A + B) / 2 * C;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;
        System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

    }
}
