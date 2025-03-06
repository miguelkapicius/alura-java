import br.com.alura.cartao.models.Cartao;
import br.com.alura.cartao.models.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        double limite = input.nextDouble();

        Cartao cartao = new Cartao(limite);

        int option = 1;

        while (option != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = input.next();

            System.out.println("Digite o valor da compra:");
            double valor = input.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.compra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                option = input.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                option = 0;
            }

        }

        System.out.println("*************************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompras());
        for (Compra compra: cartao.getCompras()) {
            System.out.println(compra.getDescricao() + " - R$" + compra.getValor());
        }

        System.out.println("*************************");

        System.out.println("\n Saldo do cartão: " +cartao.getSaldo());


    }
}