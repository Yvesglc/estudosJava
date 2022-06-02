import java.util.Scanner;

public class ExercicioBEE2313 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int aux = a;


        if (aux < b) {
            aux = b;
            b = a;
            a = aux;
        }
        if (aux < c) {
            aux = c;
            c = a;
            a = aux;
        }


        int mat1 = Math.abs(b - c);

        int mat2 = Math.abs(a - c);

        int mat3 = Math.abs(a - b);


        if (mat1 < a && a < b + c && mat2 < b && b < a + c && mat3 < c && c < a + b) {
            if (a == b && b == c)
                System.out.println("Valido-Equilatero");
            else if ((a == b && b != c) || (a == c && b != c) || (b == c && a != c))
                System.out.println("Valido-Isoceles");
            else if (a != b && b != c && a != c)
                System.out.println("Valido-Escaleno");
            if (a * a == b * b + c * c)
                System.out.println("Retangulo: S");
            else
                System.out.println("Retangulo: N");
        } else
            System.out.println("Invalido");

        sc.close();
    }
}