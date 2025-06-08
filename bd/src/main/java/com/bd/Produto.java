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

    public Produto(int idProduto, String nomeProduto, String preco){
        
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;

    }

    public Produto(String nomeProduto, String preco) {

        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = this.entrada + entrada;
        this.saldo = this.saldo + entrada;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = this.saida + saida;
        this.saldo = this.saldo - saida;
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