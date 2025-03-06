package br.com.alura.cartao.models;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean compra(Compra compra) {
        if (this.saldo < compra.getValor()) {
            return false;
        }
        this.saldo -= compra.getValor();
        this.compras.add(compra);
        return true;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }


}
