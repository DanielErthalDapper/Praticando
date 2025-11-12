package Models.Pedagógico;

import java.sql.Date;

public class Aula
{
    private final Long idAula;
    private final String titulo;
    private final Date dataAula;
    private final String descricao;
    private final String statusDaAula;

    private final Professor professor;
    private final Turma turma;

    public Aula(Long idAula, String titulo, Date dataAula, String descricao, String statusDaAula, Professor professor, Turma turma)
    {
        this.idAula = idAula;
        this.titulo = titulo;
        this.dataAula = dataAula;
        this.descricao = descricao;
        this.statusDaAula = statusDaAula;
        this.professor = professor;
        this.turma = turma;
    }

    public Aula(String titulo, Date dataAula, String descricao, String statusDaAula, Professor professor, Turma turma) {
        this(null, titulo, dataAula, descricao, statusDaAula, professor, turma);
    }

    public Long getIdAula() {
        return idAula;
    }
    public String getTitulo() {
        return titulo;
    }
    public Date getDataAula() {
        return dataAula;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getStatusDaAula() {
        return statusDaAula;
    }
}
