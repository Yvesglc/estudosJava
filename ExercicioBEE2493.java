import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioBEE2493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int bomba=0,n=0;
            List<String> lista = new ArrayList<String>();
            String inaux = sc.nextLine();
            while (inaux.equals(""))
                inaux = sc.nextLine();
            n = Integer.parseInt(inaux.trim());
            String[] expressao = new String[n];
            String[] jogadores = new String[n];
            for (int i=0 ; i<n ; i++){
                inaux = sc.nextLine();
                while (inaux.equals(""))
                    inaux = sc.nextLine();
                expressao[i] = inaux;
            }
            for (int i=0 ; i<n ; i++){
                inaux = sc.nextLine();
                while (inaux.equals(""))
                    inaux = sc.nextLine();
                jogadores[i] = inaux;
            }
            for (int i=0 ; i<n ; i++){
                String[] auxJo = new String[3];

                auxJo = jogadores[i].split(" ");
                String jnome = auxJo[0];
                int jnum = Integer.parseInt(auxJo[1].trim())-1;
                String jsimbolo = auxJo[2];

                String[] auxEx1 = new String[2];
                auxEx1 = expressao[jnum].split(" ");
                String[] auxEx2 = new String[2];
                auxEx2 = auxEx1[1].split("=");
                long opPrimNum = Long.parseLong(auxEx1[0].trim());
                long opSegNum  = Long.parseLong(auxEx2[0].trim());
                long opResult  = Long.parseLong(auxEx2[1].trim());

                /************************************************/
                long respMais  = opPrimNum + opSegNum;
                long respMenos = opPrimNum - opSegNum;
                long respVezes = opPrimNum * opSegNum;

                /************************************************/
                if (jsimbolo.equals("+"))
                    if (respMais!=opResult){
                        lista.add(jnome);
                        bomba++;
                    }
                if (jsimbolo.equals("-"))
                    if (respMenos!=opResult){
                        lista.add(jnome);
                        bomba++;
                    }
                if (jsimbolo.equals("*"))
                    if (respVezes!=opResult){
                        lista.add(jnome);
                        bomba++;
                    }
                if (jsimbolo.equals("I"))
                    if (respVezes==opResult || respMais==opResult || respMenos==opResult){
                        lista.add(jnome);
                        bomba++;
                    }
            }
            String saida = "";
            if (bomba == 0)
                System.out.printf("You Shall All Pass!");
            else{
                Collections.sort(lista);
                if (bomba == n)
                    System.out.printf("None Shall Pass!");
                else
                    for (String valor: lista)
                        saida+= valor + " ";

            }
            if (saida.length() > 0)
                saida = saida.substring (0, saida.length() - 1);
            System.out.println(saida);
        }
        sc.close();
    }
}