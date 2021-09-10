package br.edu.ifsp.arq.dw2s6.injecao_dependencias;

import org.springframework.stereotype.Component;


public class Cartao
{
    private int numero;
    private String proprietario;
    private String validade;

    public Cartao(int num, String proprietario, String validade) {
        this.numero = num;
        this.proprietario = proprietario;
        this.validade = validade;
    }


    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getProprietario()
    {
        return proprietario;
    }

    public void setProprietario(String proprietario)
    {
        this.proprietario = proprietario;
    }

    public String getValidade()
    {
        return validade;
    }

    public void setValidade(String validade)
    {
        this.validade = validade;
    }


}
