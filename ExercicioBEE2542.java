import java.util.Scanner;

public class ExercicioBEE2542 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();

            long[][] cartasM = new long[m][n];
            for(int i=0 ; i<m ; i++)
                for(int j=0 ; j<n ; j++)
                    cartasM[i][j] = sc.nextLong();

            long[][] cartasL = new long[l][n];
            for(int i=0 ; i<l ; i++)
                for(int j=0 ; j<n ; j++)
                    cartasL[i][j] = sc.nextLong();

            int cm;
            cm = sc.nextInt()-1;
            int cl;
            cl = sc.nextInt()-1;
            int a;
            a = sc.nextInt()-1;

            long Marcos   = cartasM[cm][a];
            long Leonardo = cartasL[cl][a];

            if (Marcos > Leonardo)
                System.out.println("Marcos");
            else if (Leonardo > Marcos)
                System.out.println("Leonardo");
            else
                System.out.println("Empate");
        }
        sc.close();
    }
}