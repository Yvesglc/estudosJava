import java.util.Scanner;

public class ExercicioBEE2724 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i=0 ; i<n ; i++) {

            int t = Integer.parseInt(sc.nextLine());
            String[] formula = new String[t];
            for (int x=0 ; x<t ; x++)
                formula[x] = sc.nextLine();

            int u = Integer.parseInt(sc.nextLine());
            String[] teste = new String[u];
            for (int x=0 ; x<u ; x++)
                teste[x] = sc.nextLine();

            for (int y=0 ; y<u ; y++) {
                int ok=0;
                for (int x=0 ; x<t ; x++) {
                    if(teste[y].indexOf(formula[x]) != -1){
                        String[] checaProx = teste[y].split(formula[x]);
                        if (checaProx.length>1) {
                            String[] checa = checaProx[1].split("");
                            if(!isLowerCase(checa[0]) && !isNotNumber(checa[0]))
                                ok++;
                        }
                        else
                            ok++;
                    }
                }
                if (ok!=0) System.out.println("Abortar");
                else System.out.println("Prossiga");
            }
            if(i<n-1) System.out.println();
        }
        sc.close();
    }

    private static boolean isNotNumber(String string) {
        char[] c = string.toCharArray();
        return Character.isDigit(c[0]);
    }

    private static boolean isLowerCase(String string) {
        return string.toLowerCase().equals(string);
    }
}