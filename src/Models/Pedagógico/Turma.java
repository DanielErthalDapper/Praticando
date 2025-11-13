package Models.Pedagógico;

import Models.Gestao.Idioma;
import Models.Gestao.Sala;

public class Turma
{
    private final Long idTurma;
    private final int numeroTurma;
    private final Idioma idioma;
    private Professor professor;
    private Sala sala;

    // -- CONSTRUTOR COM ID -- //
    public Turma(Long idTurma, int numeroTurma, Idioma idioma, Professor professor, Sala sala)
    {
        this.idTurma = idTurma;
        this.numeroTurma = numeroTurma;
        this.idioma = idioma;
        this.professor = professor;
        this.sala = sala;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Turma(int numeroTurma, Idioma idioma, Professor professor, Sala sala)
    {
        this(null, numeroTurma, idioma, professor, sala);
    }

    public Long getIdTurma(){return idTurma;}
    public int getNumeroTurma() {
        return numeroTurma;
    }
    public Idioma getIdioma()
    {
        return idioma;
    }
    public Professor getProfessor()
    {
        return professor;
    }
    public Sala getSala()
    {
        return sala;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
