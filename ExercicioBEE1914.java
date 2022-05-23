import java.util.Scanner;

public class ExercicioBEE1914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qt = sc.nextInt();
        int x, y;
        String j1, j2, e1, e2;

        for (int i = 0; i < qt; i++) {
            j1 = sc.next();
            e1 = sc.next();
            j2 = sc.next();
            e2 = sc.next();
            x = sc.nextInt();
            y = sc.nextInt();

            if ((x + y) % 2 == 0) {
                if (e1.equals("PAR")) System.out.println(j1);
                else System.out.println(j2);
            } else {
                if (e1.equals("PAR")) System.out.println(j2);
                else System.out.println(j1);
            }
        }
    }
}