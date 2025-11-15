package Models.Central;

import Models.Gestao.Cargos;
import Util.Ferramentas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class FuncionarioModel extends PessoaModel
{
    private final String senha;
    private final double salario;
    private final LocalDate dataContratacao;
    private final int nivelAcesso;
    private final Cargos cargo;


    // -- CONSTRUTOR COM ID --//
    public FuncionarioModel(Long idFuncionario, String nome, String cpf, String email, String senha, double salario, LocalDate dataContratacao, Cargos cargo, int nivelAcesso) {
        super(idFuncionario, nome, cpf, email);
        this.senha = senha;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    // -- CONSTRUTOR SEM ID -- //
    public FuncionarioModel(String nome, String cpf, String email, String senha, double salario, LocalDate dataContratacao, Cargos cargo, int nivelAcesso)
    {
        this(null, nome, cpf, email, senha, salario, dataContratacao, cargo, nivelAcesso);
    }

    public String getSenha() {
        return senha;
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
