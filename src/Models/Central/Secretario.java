package Models.Central;

import Models.Gestao.Cargos;

import java.time.LocalDate;

public class Secretario extends Funcionario
{
    private final String telefone;
    private final double salarioComissao;

    public Secretario(Long idSecretario, String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, double salarioComissao,  String telefone)
    {
        super(idSecretario, nome, cpf, email, salario, dataContratacao, cargo);
        this.telefone = telefone;
        this.salarioComissao = salarioComissao;
    }

    public Secretario(String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, double salarioComissao,  String telefone)
    {
        this(null, nome, cpf, email, salario, dataContratacao, cargo, salarioComissao, telefone);
    }

    public String getTelefone()
    {
        return telefone;
    }
    public double getSalarioComissao() {
        return salarioComissao;
    }
}
