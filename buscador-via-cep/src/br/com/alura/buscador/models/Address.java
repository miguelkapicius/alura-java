package br.com.alura.buscador.models;

public class Address {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private int ibge;
    private String gia;
    private int ddd;
    private int siafi;

    public Address(AddressResponse response) {
        this.cep = response.cep();
        this.logradouro = response.logradouro();
        this.complemento = response.complemento();
        this.unidade = response.unidade();
        this.bairro = response.bairro();
        this.localidade = response.localidade();
        this.uf = response.uf();
        this.estado = response.estado();
        this.regiao = response.regiao();
        this.ibge = response.ibge();
        this.gia = response.gia();
        this.ddd = response.ddd();
        this.siafi = response.siafi();
    }

    @Override
    public String toString() {
        return "(CEP: " + this.cep + ", Logradouro: " + this.logradouro + ", Bairro: " + this.bairro + ")";
    }
}
