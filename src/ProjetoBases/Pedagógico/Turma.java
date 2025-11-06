package ProjetoBases.Pedagógico;

import ProjetoBases.Central.Listas;

public class Turma
{
    /*Atributos:
código da turma
disciplina
professor
lista de alunos
calendário de aulas

Ações possíveis:
adicionar/remover alunos
registrar aula
consultar presença geral
calcular média dos alunos
encerrar turma*/

    private int numeroTurma;
    private String idioma;
    private String professor;
    private String sala;

    public Turma(int numeroTurma, String idioma, String professor, String sala)
    {
        this.numeroTurma = numeroTurma;
        this.idioma = idioma;
        this.professor = professor;
        this.sala = sala;
    }

    public int getNumeroTurma() {
        return numeroTurma;
    }
    public String getIdioma()
    {
        return idioma;
    }
    public String getProfessor()
    {
        return professor;
    }
    public String getSala()
    {
        return sala;
    }

    public void setNumeroTurma(int numeroTurma) {
        this.numeroTurma = numeroTurma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }

    public static void validacaoIdioma(String idioma)
    {
        boolean contemIdiomas = false;

        if(idioma.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O IDIOMA NÃO PODE SER VAZIO");
        }

        for(String idiomas : Listas.listaIdiomas)
        {
            if(idioma.contains(idiomas))
            {
                contemIdiomas = true;
            }
        }
        if(!contemIdiomas)
        {
            throw new IllegalArgumentException("ERRO! O IDIOMA DEVE CONTER EM NOSSA LISTA");
        }
    }

    public static void validacaoProfessor(String professor)
    {
        if(professor.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O PROFESSOR NÃO PODE SER VAZIO");
        }

        if(!Listas.professor.contains(professor))
        {
            throw new IllegalArgumentException("ERRO! O PROFESSOR DEVE CONTER EM NOSSA LISTA");
        }
    }

    public static void validacaoSala(String sala)
    {
        boolean contemSala = false;

        if(sala.isBlank())
        {
            throw new IllegalArgumentException("ERRO! A SALA NÃO PODE SER VAZIA");
        }

        for(String salas : Listas.listaSalas)
        {
            if(sala.contains(salas))
            {
                throw new IllegalArgumentException("ERRO! A SALA DEVE CONTER EM NOSSA LISTA");
            }
        }
    }
}
