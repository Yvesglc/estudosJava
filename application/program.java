package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xa, xb, xc, ya, yb, yc;

        System.out.println("Diga as medidas do triângulo X:");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        System.out.println("Diga as medidas do triângulo Y:");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double p = (xa + xb + xc) / 2;
        double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
        p = (ya + yb + yc) / 2;
        double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
        System.out.printf("Area do triângulo X: %.4f%n", areaX);
        System.out.printf("Area do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área é a do triângulo X");
        } else {
            System.out.println("Maior área é a do triângulo Y");
        }
        sc.close();
    }
}
