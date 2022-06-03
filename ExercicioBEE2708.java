import java.util.Scanner;

public class ExercicioBEE2708 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String n = sc.nextLine();
            int quant = sc.nextInt();
            if (n.equals("Salida")) {
                int resultsalida =+ quant;
                System.out.println(resultsalida);
            } else if (n.equals("Abend")) {
                break;
            }
        }
    }
}
