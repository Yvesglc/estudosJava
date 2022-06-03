import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioBEE2653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> joias = new HashSet<>();
        while (sc.hasNext()) {
            String joia = sc.nextLine();
            joias.add(joia);
        }
        System.out.println(joias.size());
    }

}