package rluispdev.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do Cartão: ");
        double limit = read.nextDouble();
        CreditCard card = new CreditCard(limit);





    }
}
