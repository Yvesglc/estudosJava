import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class ExercicioBEE2721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String entrada = sc.nextLine();
        String[] entra = entrada.split(" ");
        List<Integer> intList = new ArrayList<Integer>();
        for (String s : entra)
            intList.add(Integer.valueOf(s));
        int soma = 0;
        for (int x : intList) soma += x;

        String[] nomes = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
        int resto = soma % 9;
        if (resto == 0) System.out.println("Rudolph");
        else System.out.println(nomes[resto - 1]);

        sc.close();
    }
}