import java.util.Scanner;

public class ExercicioBEE2683 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int graus = sc.nextInt();

            if (graus < 90) System.out.println("Bom Dia!!");
            else if (graus < 180) System.out.println("Boa Tarde!!");
            else if (graus < 270) System.out.println("Boa Noite!!");
            else if (graus < 360) System.out.println("De Madrugada!!");
            else System.out.println("Bom Dia!!");
        }
        sc.close();
    }
}

