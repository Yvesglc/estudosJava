import java.util.Scanner;

public class ExercicioBEE1175 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[20];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        int indexFinal = n.length - 1;
        for (int i = 0; i < n.length / 2; i++) {
            int aux = n[i];
            n[i] = n[indexFinal];
            n[indexFinal] = aux;
            indexFinal--;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "]" + " = " + n[i]);
        }
    }
}