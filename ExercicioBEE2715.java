import java.util.Scanner;

public class ExercicioBEE2715 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        for(int i = 0; i < times; i++) {
            int squ = scan.nextInt();
            System.out.printf("%d ", squ);
        }
        scan.close();
    }
}
