import java.util.Scanner;

public class ExercicioBEE2762 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String STR = sc.next();
        int A = Integer.parseInt(STR.split("\\.")[0]);
        int B = Integer.parseInt(STR.split("\\.")[1]);
        System.out.printf("%d.%d\n", B, A);
    }

}