import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float renda, taxa, taxaASerIsenta8porc, taxaASerIsenta18porc, taxaASerIsenta28porc;
        Scanner sc = new Scanner(System.in);
        renda = sc.nextFloat();

        if (renda <= 2000) {
            System.out.print("Isento\n");
        } else {
            if (renda > 2000 && renda <= 3000) {
                taxaASerIsenta8porc = renda - 2000;
                taxa = calculaTaxas(taxaASerIsenta8porc,0,0);
            } else if (renda > 3000 && renda <= 4500) {
                taxaASerIsenta8porc = renda - 2000;
                taxaASerIsenta18porc = taxaASerIsenta8porc - 1000;
                taxaASerIsenta8porc -= taxaASerIsenta18porc;
                taxa = calculaTaxas(taxaASerIsenta8porc,taxaASerIsenta18porc,0);
            } else {
                taxaASerIsenta8porc = renda - 2000;
                taxaASerIsenta18porc = taxaASerIsenta8porc - 1000;
                taxaASerIsenta28porc = taxaASerIsenta18porc - 1500;
                taxaASerIsenta8porc -= taxaASerIsenta18porc;
                taxaASerIsenta18porc -= taxaASerIsenta28porc;
                taxa = calculaTaxas(taxaASerIsenta8porc,taxaASerIsenta18porc,taxaASerIsenta28porc);
            }
            System.out.printf("R$ %.2f\n", taxa);
        }

    }

    public static float calculaTaxas(float taxaASerIsenta1, float taxaASerIsenta2, float taxaASerIsenta3){
        taxaASerIsenta1 = ((taxaASerIsenta1 * 8) / 100);
        taxaASerIsenta2 = ((taxaASerIsenta2 * 18) / 100);
        taxaASerIsenta3 = ((taxaASerIsenta3 * 28) / 100);
        if(taxaASerIsenta2 != 0) {
            return taxaASerIsenta1+taxaASerIsenta2;
        } else if (taxaASerIsenta3 != 0) {
            return taxaASerIsenta1+taxaASerIsenta2+taxaASerIsenta3;
        }
        return taxaASerIsenta1;
    }

}