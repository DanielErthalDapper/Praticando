package Models.Gestao;

import Models.Central.Aluno;
import Models.Central.Responsavel;
import Models.Gestao.Enum.StatusContrato;

import java.time.LocalDate;

public class Contrato
{
    private final Long idContrato;
    private final Aluno aluno;
    private final Responsavel responsavel;
    private final Plano plano;
    private final LocalDate dataInicio;
    private final LocalDate dataFim;
    private final StatusContrato status;

    public Contrato(Long idContrato, Aluno aluno, Responsavel responsavel, Plano plano, LocalDate dataInicio, LocalDate dataFim, StatusContrato status) {
        this.idContrato = idContrato;
        this.aluno = aluno;
        this.responsavel = responsavel;
        this.plano = plano;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public Contrato(Aluno aluno, Responsavel responsavel, Plano plano, LocalDate dataInicio, LocalDate dataFim, StatusContrato status)
    {
        this(null, aluno, responsavel, plano, dataInicio, dataFim, status);
    }

    public Long getIdContrato() {
        return idContrato;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public Responsavel getResponsavel() {
        return responsavel;
    }
    public Plano getPlano() {
        return plano;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public StatusContrato getStatus() {
        return status;
    }
}
