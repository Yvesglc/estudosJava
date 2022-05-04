package Aplicacao;

import Entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto product = new Produto();
        System.out.println("Enter the product data:");
        System.out.println("Name: ");
        product.setName(sc.nextLine());
        System.out.println("Price: ");
        product.setPrice(sc.nextDouble());
        System.out.println("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

        System.out.println(product);

        sc.close();

    }
}
