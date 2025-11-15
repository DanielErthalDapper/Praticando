package Models.Central;

import Models.Gestao.Cargos;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa
{
    private final double salario;
    private final LocalDate dataContratacao;
    private final int nivelAcesso;
    private final Cargos cargo;


    // -- CONSTRUTOR COM ID --//
    public Funcionario(Long idFuncionario, String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, int nivelAcesso) {
        super(idFuncionario, nome, cpf, email);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Funcionario(String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, int nivelAcesso)
    {
        this(null, nome, cpf, email, salario, dataContratacao, cargo, nivelAcesso);
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
    public int getNivelAcesso() {
        return nivelAcesso;
    }
}
