package Models.Pedagógico;

import Models.Central.FuncionarioModel;
import Models.Gestao.Cargos;
import Models.Gestao.Idioma;

public class Professor extends FuncionarioModel
{
    private Idioma idioma;

    // -- CONSTRUTOR COM ID -- //
    public Professor(Long idProfessor, String nome, String cpf, String email, String senha, double salario, Cargos cargo, int nivelAcesso, Idioma idioma)
    {
        super(idProfessor, nome, cpf, email, senha, salario, cargo, nivelAcesso);
        AlteraIdioma(idioma);
    }

    // -- CONSTRUTOR SEM ID -- //
    public Professor(String nome, String cpf, String email, String senha, double salario, Cargos cargo, int nivelAcesso, Idioma idioma)
    {
        this(null, nome, cpf, email, senha, salario, cargo, nivelAcesso, idioma);
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
