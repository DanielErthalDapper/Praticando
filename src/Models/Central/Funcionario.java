package Models.Central;

import Models.Gestao.Cargos;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa
{
    private double salario;
    private final LocalDate dataContratacao;
    private Cargos cargo;


    // -- CONSTRUTOR COM ID --//
    public Funcionario(Long idFuncionario, String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo) {
        super(idFuncionario, nome, cpf, email);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Funcionario(String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo)
    {
        this(null, nome, cpf, email, salario, dataContratacao, cargo);
    }

    public double getSalario() {
        return salario;
    }
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public Cargos getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
}
