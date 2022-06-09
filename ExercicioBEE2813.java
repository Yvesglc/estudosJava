import java.util.Scanner;

public class ExercicioBEE2813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;

        for (int i = 0; i < n; i++) {
            String irProtrabalho = sc.next();
            String irPracasa = sc.next();
            if (irProtrabalho.equalsIgnoreCase("chuva") && casaSobrando == 0) {
                casaComprado++;
                trabSobrando++;
            } else if (irProtrabalho.equalsIgnoreCase("chuva") && casaSobrando > 0) {
                trabSobrando++;
                casaSobrando--;
            }
            if (irPracasa.equalsIgnoreCase("chuva") && trabSobrando == 0) {
                trabComprado++;
                casaSobrando++;
            } else if (irPracasa.equalsIgnoreCase("chuva") && trabSobrando > 0) {
                casaSobrando++;
                trabSobrando--;
            }
        }
        System.out.println(casaComprado + " " + trabComprado);
    }
}
