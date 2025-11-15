package Models.Central;

import Models.Gestao.Cargos;

import java.time.LocalDate;

public class Diretor extends FuncionarioModel
{
    private int NumeroDeEscolas;

    public Diretor(Long idFuncionario, String nome, String cpf, String email, String senha, double salario, LocalDate dataContratacao, Cargos cargo, int nivelAcesso, int numeroDeEscolas) {
        super(idFuncionario, nome, cpf, email, senha, salario, dataContratacao, cargo, nivelAcesso);
        NumeroDeEscolas = numeroDeEscolas;
    }

    public Diretor(String nome, String cpf, String email, String senha, double salario, LocalDate dataContratacao, Cargos cargo, int nivelAcesso, int numeroDeEscolas) {
        super(null, nome, cpf, email, senha, salario, dataContratacao, cargo, nivelAcesso);
        NumeroDeEscolas = numeroDeEscolas;
    }

    public int getNumeroDeEscolas() {
        return NumeroDeEscolas;
    }
    public void setNumeroDeEscolas(int numeroDeEscolas) {
        NumeroDeEscolas = numeroDeEscolas;
    }
}
