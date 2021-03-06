import java.util.Scanner;
import java.util.Locale;

public class ExercicioBEE2757 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.printf("A = %d, B = %d, C = %d\n", x, y, z);//5
        System.out.printf("A = %10d, B = %10d, C = %10d\n", x, y, z);//6
        System.out.printf("A = %010d, B = %010d, C = %010d\n", x, y, z);//7
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", x, y, z);//8
    }
}