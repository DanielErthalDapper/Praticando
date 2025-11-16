package Models.Central;

import Models.Gestao.Cargos;
import Models.Gestao.Idioma;

import java.time.LocalDate;

public class Professor extends Funcionario
{
    private Idioma idioma;

    // -- CONSTRUTOR COM ID -- //
    public Professor(Long idProfessor, String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, Idioma idioma)
    {
        super(idProfessor, nome, cpf, email, salario, dataContratacao, cargo);
        AlteraIdioma(idioma);
    }

    // -- CONSTRUTOR SEM ID -- //
    public Professor(String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, Idioma idioma)
    {
        this(null, nome, cpf, email, salario, dataContratacao, cargo, idioma);
    }

    // -- GETTERS -- //
    public Idioma getIdioma()
    {
        return idioma;
    }

    // -- ALTERADOR -- //
    public void AlteraIdioma(Idioma idioma)
    {
        if(idioma == null)
        {
            throw new IllegalArgumentException("ERRO! O IDIOMA NÃO PODE SER NULO");
        }

        this.idioma = idioma;
    }
}
