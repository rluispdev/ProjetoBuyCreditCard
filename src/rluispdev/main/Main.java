package rluispdev.main;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do Cartão: ");
        double limit = read.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while (exit !=0) {

            System.out.println("Digite a descrição da compra: ");
            String description = read.next();

            System.out.println("Digite o valor da compra: ");
            double value = read.nextDouble();

            Buy buy = new Buy(description, value);
            boolean buySucess = card.launchBuy(buy);

            if (buySucess) {
                System.out.println("Compra realizada");
                System.out.println("Digite [0] - para SAIR ou [1] -  para continuar.");
                exit = read.nextInt();
            }else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }
        System.out.println("_________________________________");
        System.out.println("Compras Realizadas\n");
        Collections.sort(card.getBuys());
        for (Buy itemBuyied : card.getBuys()){
            System.out.println(itemBuyied.getDescription() + " - " + itemBuyied.getValue());
        }
        System.out.println("\n_________________________________");
        System.out.printf("\nSaldo do cartão: R$ %.2f " , card.getBalance());

    }
}
