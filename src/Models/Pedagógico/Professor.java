package Models.Pedagógico;

import Models.Central.FuncionarioModel;
import Models.Central.Listas;

public class Professor extends FuncionarioModel
{
    /*Atributos:
nome, CPF, e-mail
especialidade (idioma)
lista de turmas

Ações possíveis:
registrar aulas ministradas
lançar presenças e notas
consultar turmas e alunos
alterar conteúdo da aula
gerar relatórios de desempenho*/

    private String especialidadeIdioma;

    public Professor(String nome, String cpf, String email, String senha, double salario, String cargo, int nivelAcesso, String especialidadeIdioma)
    {
        super(nome, cpf, email, senha, salario, cargo, nivelAcesso);
        this.especialidadeIdioma = especialidadeIdioma;

        Listas.professor.add(this);
    }

    public String getEspecialidadeIdioma()
    {
        return especialidadeIdioma;
    }
    public void setEspecialidadeIdioma(String especialidadeIdioma)
    {
        this.especialidadeIdioma = especialidadeIdioma;
    }

    public static void validacaoEspecialidade(String especialidadeIdioma)
    {
        boolean contemEspecialidade = false;

        if(especialidadeIdioma.isBlank())
        {
            throw new IllegalArgumentException("ERRO! A ESPECIALIDADE NÃO PODE SER VAZIO");
        }

        for(String especialidade : Listas.listaIdiomas)
        {
            if(especialidadeIdioma.contains(especialidade))
            {
                contemEspecialidade = true;
            }
        }
        if(!contemEspecialidade)
        {
            throw new IllegalArgumentException("ERRO! A ESPECIALIDADE DEVE ESTAR EM NOSSAS OPÇÕES");
        }
    }
}
