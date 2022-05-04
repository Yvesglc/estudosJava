import java.util.Scanner;

public class ExercicioBEE1146 {

    public static void main(String[] args) {

        int X;
        Scanner sc = new Scanner(System.in);
        while ((X = sc.nextInt()) != 0) {
            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    System.out.print(i + "\n");
                } else {
                    System.out.print(i + " ");
                }

            }
        }
    }

}