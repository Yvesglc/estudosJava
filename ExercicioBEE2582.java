import java.util.Scanner;

public class ExercicioBEE2582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int button1 = sc.nextInt();
            int button2 = sc.nextInt();
            int resultado = button1 + button2;
            switch (resultado) {
                case 0:
                    System.out.println("PROXYCITY");
                    break;
                case 1:
                    System.out.println("P.Y.N.G.");
                    break;
                case 2:
                    System.out.println("DNSUEY!");
                    break;
                case 3:
                    System.out.println("SERVERS");
                    break;
                case 4:
                    System.out.println("HOST!");
                    break;
                case 5:
                    System.out.println("CRIPTONIZE");
                    break;
                case 6:
                    System.out.println("OFFLINE DAY");
                    break;
                case 7:
                    System.out.println("SALT");
                    break;
                case 8:
                    System.out.println("ANSWER!");
                    break;
                case 9:
                    System.out.println("RAR?");
                    break;
                case 10:
                    System.out.println("WIFI ANTENNAS?");
                    break;
                default:
            }
        }
    }
}
