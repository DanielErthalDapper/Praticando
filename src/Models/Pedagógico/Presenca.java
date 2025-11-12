package Models.Pedagógico;

import java.sql.Date;

public class Presenca
{
    private final Long idPresenca;
    private final boolean presenca;
    private final Date dataLancamento;
    private final Aluno aluno;
    private final Aula aula;

    public Presenca(Long idPresenca, boolean presenca, Date dataLancamento, Aluno aluno, Aula aula) {
        this.idPresenca = idPresenca;
        this.presenca = presenca;
        this.dataLancamento = dataLancamento;
        this.aluno = aluno;
        this.aula = aula;
    }

    public Presenca(boolean presenca, Date dataLancamento, Aluno aluno, Aula aula)
    {
        this(null, presenca, dataLancamento, aluno, aula);
    }

    public Long getIdPresenca() {
        return idPresenca;
    }
    public boolean isPresenca() {
        return presenca;
    }
    public Date getDataLancamento() {
        return dataLancamento;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public Aula getAula() {
        return aula;
    }
}
