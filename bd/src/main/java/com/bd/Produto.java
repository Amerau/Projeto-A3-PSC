package com.bd;

public class Produto {

    private String nomeProduto;
    private int idProduto;
    private String preco;
    private int entrada;
    private int saida;
    private int saldo;

    public Produto(int idProduto, String nomeProduto, String preco, int entrada, int saida, int saldo) {

        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.preco = preco;
        this.entrada = entrada;
        this.saida = saida;
        this.saldo = saldo;
    }

    public Produto(String nomeProduto, String preco, int entrada, int saida, int saldo) {

        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.entrada = entrada;
        this.saida = saida;
        this.saldo = saldo;
    }

    public Produto(int idProduto, String nomeProduto, String preco, int saldo) {

        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.saldo = saldo;
        this.idProduto = idProduto;
    }

    public Produto(int idProduto, String nomeProduto, String preco) {

        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.idProduto = idProduto;
        this.entrada = 0;
        this.saida = 0;
        this.saldo = 0;

    }

    public Produto(String nomeProduto, String preco) {

        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.entrada = 0;
        this.saida = 0;
        this.saldo = 0;

    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String produto) {
        this.nomeProduto = produto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getSaldo() {
        return saldo;
    }

}