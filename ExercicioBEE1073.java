import java.util.Scanner;

public class ExercicioBEE1073 {

        public static void main(String[] args) {

            int N;
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();


            for (int i = 2; i <= N; i += 2) {
                System.out.print(i + "^2 = " + (i * i) + "\n");
            }

        }

    }
