package br.edu.ifsp.arq.dw2s6.injecao_dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout
{
    CartaoMastercad cartaoMastercad = new CartaoMastercad();
    CartaoVisa cartaoVisa = new CartaoVisa();
    @Autowired
    @Qualifier("cartaoMastercad")
    private Operadora operadora;


    public void finaliza(Compras buy, Cartao card)
    {
        if(operadora.autorizar(buy, card) == 4) {
            cartaoMastercad.imprimir("Compra autorizada");
        }else{
            cartaoMastercad.imprimir("Compra não autorizada");
        }
    }
}
