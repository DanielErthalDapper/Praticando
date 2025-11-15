package Models.Central;

import Models.Administrativo.Enum.StatusAtendimento;
import Models.Comercial.Enum.Origem;
import Models.Comercial.Lead;

import java.time.LocalDate;

public class Atendimentos
{
    private final Long idAtendimentos;
    private final LocalDate horario;
    private final Lead lead;
    private final Funcionario funcionarioComercial;
    private final Funcionario funcionarioAdministrativo;
    private StatusAtendimento statusAtendimento;
    private final Origem origem;

    public Atendimentos(Long idAtendimentos, LocalDate horario, Lead lead, Funcionario funcionarioComercial, Funcionario funcionarioAdministrativo, Origem origem, StatusAtendimento statusAtendimento)
    {
        this.idAtendimentos = idAtendimentos;
        this.horario = horario;
        this.lead = lead;
        this.funcionarioComercial = funcionarioComercial;
        this.funcionarioAdministrativo = funcionarioAdministrativo;
        this.origem = origem;
        this.statusAtendimento = statusAtendimento;
    }

    public Atendimentos(LocalDate horario, Lead lead, Funcionario funcionarioComercial, Funcionario funcionarioAdministrativo, Origem origem, StatusAtendimento statusAtendimento)
    {
        this(null, horario, lead, funcionarioComercial, funcionarioAdministrativo, origem, statusAtendimento);
    }

    public Long getIdAtendimentos() {
        return idAtendimentos;
    }
    public LocalDate getHorario() {
        return horario;
    }
    public Lead getLead() {
        return lead;
    }
    public Funcionario getFuncionarioComercial() {
        return funcionarioComercial;
    }
    public Funcionario getFuncionarioAdministrativo() {
        return funcionarioAdministrativo;
    }
    public StatusAtendimento getStatusAtendimento() {
        return statusAtendimento;
    }
    public Origem getOrigem() {
        return origem;
    }

    public void setStatusAtendimento(StatusAtendimento statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }
}
