package Models.Pedagógico;

public class Turma
{
    private final Long idTurma;
    private final int numeroTurma;
    private final String idioma;
    private final String professor;
    private final String sala;

    // -- CONSTRUTOR COM ID -- //
    public Turma(Long idTurma, int numeroTurma, String idioma, String professor, String sala)
    {
        this.idTurma = idTurma;
        this.numeroTurma = numeroTurma;
        this.idioma = idioma;
        this.professor = professor;
        this.sala = sala;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Turma(int numeroTurma, String idioma, String professor, String sala)
    {
        this(null, numeroTurma, idioma, professor, sala);
    }

    public Long getIdTurma(){return idTurma;}
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
}
