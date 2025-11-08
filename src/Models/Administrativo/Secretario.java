package Models.Administrativo;

import Models.Central.FuncionarioModel;

public class Secretario extends FuncionarioModel
{
    private String telefone;

    public Secretario(String nome, String cpf, String email, String senha,
                      double salario, String cargo, int nivelAcesso, String telefone)
    {
        super(nome, cpf, email, senha, salario, cargo, nivelAcesso);
        this.telefone = telefone;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
