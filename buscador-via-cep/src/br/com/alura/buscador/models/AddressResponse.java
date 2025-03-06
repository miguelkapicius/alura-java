package br.com.alura.buscador.models;

public record AddressResponse(
    String cep,
    String logradouro,
    String complemento,
    String unidade,
    String bairro,
    String localidade,
    String uf,
    String estado,
    String regiao,
    int ibge,
    String gia,
    int ddd,
    int siafi
) {}