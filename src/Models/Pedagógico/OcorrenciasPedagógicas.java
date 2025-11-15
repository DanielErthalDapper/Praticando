package Models.Pedagógico;

import Models.Central.Aluno;
import Models.Pedagógico.Enum.TipoOcorrencia;

public class OcorrenciasPedagógicas
{
    private final Long idOcorrencia;
    private final String tituloDaOcorrencia;
    private final String descricaoDaOcorrencia;
    private final Aluno aluno;
    private final TipoOcorrencia tipoOcorrencia;

    public OcorrenciasPedagógicas(Long idOcorrencia, String tituloDaOcorrencia, String descricaoDaOcorrencia, Aluno aluno, TipoOcorrencia tipoOcorrencia) {
        this.idOcorrencia = idOcorrencia;
        this.tituloDaOcorrencia = tituloDaOcorrencia;
        this.descricaoDaOcorrencia = descricaoDaOcorrencia;
        this.aluno = aluno;
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public OcorrenciasPedagógicas(String tituloDaOcorrencia, String descricaoDaOcorrencia, Aluno aluno, TipoOcorrencia tipoOcorrencia)
    {
        this(null, tituloDaOcorrencia, descricaoDaOcorrencia, aluno, tipoOcorrencia);
    }

    public Long getIdOcorrencia() {
        return idOcorrencia;
    }
    public String getTituloDaOcorrencia() {
        return tituloDaOcorrencia;
    }
    public String getDescricaoDaOcorrencia() {
        return descricaoDaOcorrencia;
    }
    public TipoOcorrencia getTipoOcorrencia() {
        return tipoOcorrencia;
    }
    public Aluno getAluno() {
        return aluno;
    }
}
