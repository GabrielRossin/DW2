package br.edu.ifsp.arq.dw2s6.injecao_dependencias;

import org.springframework.stereotype.Component;

@Component
public class CartaoVisa implements Operadora
{
    @Override
    public int autorizar(Compras buy, Cartao card)
    {

        int num;
        int num2 = card.getNumero();
        int resto;
        int verificador = 1;
        int libera = 0;
        if(card.getNumero() < 1234 || buy.getValor() >= 1000)
        {
            return libera;

        }
        else
        {

            int digitos = (int) (Math.log10(card.getNumero()));
            while (verificador < 5)
            {

                num = (int) (num2 /Math.pow(10,digitos));

                if (num != verificador)
                {
                    return libera;
                }
                else
                {
                    resto = (int) (num2%Math.pow(10,digitos));
                    digitos--;
                    num2 = resto;
                    verificador++;
                    libera++;

                }

            }
            return libera;

        }


    }


    public void imprimir(String documento)
    {
        System.out.println(documento+ " Usando o cartão Visa");
    }

}
