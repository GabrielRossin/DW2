package br.edu.ifsp.arq.dw2s6.injecao_dependencias;

import org.springframework.stereotype.Component;


public class Compras
{
    private int numero_compra;
    private String  nome_cliente;
    private String nome_produto;
    private double valor;

    public Compras(int numero_compra, String nome_cliente, String nome_produto, double valor)
    {
        this.numero_compra = numero_compra;
        this.nome_cliente = nome_cliente;
        this.nome_produto = nome_produto;
        this.valor = valor;
    }

    public int getNumero_compra() {
        return numero_compra;
    }

    public void setNumero_compra(int numero_compra) {
        this.numero_compra = numero_compra;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
