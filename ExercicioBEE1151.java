import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ExercicioBEE1151 {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, N;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.print(n1 + " " + n2);
        for (i = 2; i < N; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.print("\n");
    }

}