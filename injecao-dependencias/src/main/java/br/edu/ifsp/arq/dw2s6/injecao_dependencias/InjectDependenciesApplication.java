package br.edu.ifsp.arq.dw2s6.injecao_dependencias;

import br.edu.ifsp.arq.dw2s6.injecao_dependencias.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectDependenciesApplication
{

	public static void main(String[] args)
	{


		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Compras compra1 = new Compras(123,"Gabriel","Banana",550);
		Compras compra2 = new Compras(184,"Filipe","Limão",600);
		Compras compra3 = new Compras(789,"Rossin","Tomate",1000);
		Compras compra4 = new Compras(456,"Luna","Romã",217);
		Compras compra5 = new Compras(753,"Luffy","uva",777);

		Cartao card1 = new Cartao(123456,"Gabriel","01/27");
		Cartao card2 = new Cartao(1595789,"Filipe","02/28");
		Cartao card3 = new Cartao(0000000,"Rossin","03/29");
		Cartao card4 = new Cartao(123498756,"Luna","04/22");
		Cartao card5 = new Cartao(102587469,"Luffy","05/25");


		Checkout checkout = context.getBean(Checkout.class);

		checkout.finaliza(compra1, card1);//autorizado
		checkout.finaliza(compra2, card1); //autorizado
		checkout.finaliza(compra3, card1); // não autorizado
		checkout.finaliza(compra4, card1); //autorizado
		checkout.finaliza(compra5, card1); //autorizado

		System.out.println("-----------------------------------------------");


		checkout.finaliza(compra1, card2);//nao autorizado
		checkout.finaliza(compra2, card2);//nao autorizado
		checkout.finaliza(compra3, card2);//nao autorizado
		checkout.finaliza(compra4, card2);//nao autorizado
		checkout.finaliza(compra5, card2);//nao autorizado

		System.out.println("-----------------------------------------------");


		checkout.finaliza(compra1, card3);//nao autorizado
		checkout.finaliza(compra2, card3);//nao autorizado
		checkout.finaliza(compra3, card3);//nao autorizado
		checkout.finaliza(compra4, card3);//nao autorizado
		checkout.finaliza(compra5, card3);//nao autorizado

		System.out.println("-----------------------------------------------");


		checkout.finaliza(compra1, card4);//autorizado
		checkout.finaliza(compra2, card4); //autorizado
		checkout.finaliza(compra3, card4); // não autorizado
		checkout.finaliza(compra4, card4); //autorizado
		checkout.finaliza(compra5, card4); //autorizado

		System.out.println("-----------------------------------------------");


		checkout.finaliza(compra1, card5);// não autorizado
		checkout.finaliza(compra2, card5); // não autorizado
		checkout.finaliza(compra3, card5); // não autorizado
		checkout.finaliza(compra4, card5); //não autorizado
		checkout.finaliza(compra5, card5); //não autorizado

		System.out.println("-----------------------------------------------");


		((ConfigurableApplicationContext) context).close();
	}


}
