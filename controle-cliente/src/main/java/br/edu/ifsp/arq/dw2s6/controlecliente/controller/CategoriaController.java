package br.edu.ifsp.arq.dw2s6.controlecliente.controller;


import br.edu.ifsp.arq.dw2s6.controlecliente.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CategoriaController
{
    @GetMapping("/clientes")
    public List<Cliente> listar()
    {
        var cliente1 = new Cliente();
        cliente1.setCodigo(1L);
        cliente1.setNome("Gabriel");
        cliente1.setEmail("Gabriel2787@hotmail.com");
        cliente1.setTelefone("(75)93276-7560");

        var cliente2 = new Cliente();
        cliente2.setCodigo(2L);
        cliente2.setNome("Filipe");
        cliente2.setEmail("Filipe2367@gmail.com");
        cliente2.setTelefone("(36)90510-1133");

        var cliente3 = new Cliente();
        cliente3.setCodigo(3L);
        cliente3.setNome("Rossin");
        cliente3.setEmail("Rossin2105@hotmail.com");
        cliente3.setTelefone("(10)98247-3613");



        return Arrays.asList(cliente1,cliente2,cliente3);
    }

}
