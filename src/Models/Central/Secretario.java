package Models.Central;

import Models.Gestao.Cargos;

public class Secretario extends Funcionario
{
    private final String telefone;
    private final double salarioComissao;

    public Secretario(Long idSecretario, String nome, String cpf, String email, String senha, double salario, double salarioComissao, Cargos cargo, int nivelAcesso, String telefone)
    {
        super(idSecretario, nome, cpf, email, senha, salario, cargo, nivelAcesso);
        this.telefone = telefone;
        this.salarioComissao = salarioComissao;
    }

    public Secretario(String nome, String cpf, String email, String senha, double salario, double salarioComissao, Cargos cargo, int nivelAcesso, String telefone)
    {
        this(null, nome, cpf, email, senha, salario, salarioComissao, cargo, nivelAcesso, telefone);
    }

    public String getTelefone()
    {
        return telefone;
    }
    public double getSalarioComissao() {
        return salarioComissao;
    }
}
