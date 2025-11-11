package Models.Administrativo;

import Models.Central.FuncionarioModel;

public class Secretario extends FuncionarioModel
{
    private String telefone;
    private double salarioComissao;

    public Secretario(String nome, String cpf, String email, String senha,
                      double salario, double salarioComissao, String cargo, int nivelAcesso, String telefone)
    {
        super(nome, cpf, email, senha, salario, cargo, nivelAcesso);
        this.telefone = telefone;
        this.salarioComissao = salarioComissao;
    }

    public String getTelefone()
    {
        return telefone;
    }
    public double getSalarioComissao() {
        return salarioComissao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setSalarioComissao(double salarioComissao) {
        this.salarioComissao = salarioComissao;
    }

    //VALIDAÇÕES DE TELEFONE E SALÁRIO COMISSAO
}
