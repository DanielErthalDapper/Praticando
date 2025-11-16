package Models.Central;

import Models.Gestao.Cargos;

import java.time.LocalDate;

public class Diretor extends Funcionario
{
    private int NumeroDeEscolas;

    public Diretor(Long idFuncionario, String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, int numeroDeEscolas) {
        super(idFuncionario, nome, cpf, email, salario, dataContratacao, cargo);
        NumeroDeEscolas = numeroDeEscolas;
    }

    public Diretor(String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, int numeroDeEscolas) {
        super(null, nome, cpf, email, salario, dataContratacao, cargo);
        NumeroDeEscolas = numeroDeEscolas;
    }

    public int getNumeroDeEscolas() {
        return NumeroDeEscolas;
    }
    public void setNumeroDeEscolas(int numeroDeEscolas) {
        NumeroDeEscolas = numeroDeEscolas;
    }
}
