import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE2782 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        String entrada1 = sc.nextLine();
        String[] entr1 = entrada1.split(" ");
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < N; i++)
            num.add(Integer.parseInt(entr1[i]));

        int escadinha = 0;
        List<Integer> escada = new ArrayList<Integer>();
        List<Integer> numAux;
        numAux = num;


        for (int i = 0; i < numAux.size(); i++) {
            for (int j = 0; j < numAux.size(); j++) {
                if (numAux.get(i).equals(numAux.get(j))) {
                    escada.add(numAux.get(i));
                }
            }
            if (escada.size() > 1) {
                escadinha++;
                numAux.removeAll(List.of(numAux.get(i)));
                System.out.println("escada: " + escada);
                System.out.println("escadinha: " + escadinha);
            }
            escada.clear();
        }

        sc.close();
    }
}