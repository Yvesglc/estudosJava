import java.util.Scanner;

public class ExercicioBEE2850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp;
        label:
        while (sc.hasNext()) {
            inp = sc.nextLine();
            if (inp != null) {
                switch (inp) {
                    case "esquerda":
                        System.out.println("ingles");
                        break;
                    case "direita":
                        System.out.println("frances");
                        break;
                    case "nenhuma":
                        System.out.println("portugues");
                        break;
                    case "as duas":
                        System.out.println("caiu");
                        break;
                    default:
                        break label;
                }
            }

        }
    }
}
