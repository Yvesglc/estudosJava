import java.util.Scanner;

public class ExercicioBEE2936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int curupira = 300;
        int boitata = 1500;
        int boto = 600;
        int mapinguari = 1000;
        int iara = 150;
        int donachica = 225;

        int p1 = sc.nextInt() * curupira;
        int p2 = sc.nextInt() * boitata;
        int p3 = sc.nextInt() * boto;
        int p4 = sc.nextInt() * mapinguari;
        int p5 = sc.nextInt() * iara;

        int total = p1 + p2 + p3 + p4 + p5 + donachica;

        System.out.println(total);
    }
}
