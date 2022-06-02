import java.util.Scanner;

public class ExercicioBEE1962 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            int resultado = 2015 - t;
            if(resultado<0 || resultado == 0){
                System.out.println(Math.abs(resultado-1)+ " A.C.");
            }
            else{
                System.out.println(resultado + " D.C.");
            }
        }
    }

}