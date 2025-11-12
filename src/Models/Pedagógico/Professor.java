package Models.Pedagógico;

import Models.Central.FuncionarioModel;
import Models.Gestao.Cargos;

public class Professor extends FuncionarioModel
{
    private final String especialidadeIdioma;

    // -- CONSTRUTOR COM ID -- //
    public Professor(Long idProfessor, String nome, String cpf, String email, String senha, double salario, Cargos cargo, int nivelAcesso, String especialidadeIdioma)
    {
        super(idProfessor, nome, cpf, email, senha, salario, cargo, nivelAcesso);
        this.especialidadeIdioma = especialidadeIdioma;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Professor(String nome, String cpf, String email, String senha, double salario, Cargos cargo, int nivelAcesso, String especialidadeIdioma)
    {
        this(null, nome, cpf, email, senha, salario, cargo, nivelAcesso, especialidadeIdioma);
    }

    public String getEspecialidadeIdioma()
    {
        return especialidadeIdioma;
    }
}
