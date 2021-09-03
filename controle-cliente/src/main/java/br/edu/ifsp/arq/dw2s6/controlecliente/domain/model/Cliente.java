package br.edu.ifsp.arq.dw2s6.controlecliente.domain.model;

public class Cliente
{
    private Long codigo;
    private String nome;
    private String email;
    private String telefone;

    public Long getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Long codigo)
    {
        this.codigo = codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        {
            return true;
        }

        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Cliente cliente = (Cliente) o;

        if (codigo == null)
        {
            if (cliente.codigo == null)
            {
                return false;
            }
            else
            {
                if (!codigo.equals(cliente.codigo))
                {
                    return false;
                }
            }
        }
        return true;
    }

}
