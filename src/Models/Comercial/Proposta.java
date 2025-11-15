package Models.Comercial;

import Models.Gestao.Plano;

import java.time.LocalDate;

public class Proposta
{
    private final Long idProposta;
    private final Lead lead;
    private final Plano plano;
    private final double valorTotalECondicoes;
    private final LocalDate dataValidade;

    public Proposta(Long idProposta, Lead lead, Plano plano, double valorTotalECondicoes, LocalDate dataValidade) {
        this.idProposta = idProposta;
        this.lead = lead;
        this.plano = plano;
        this.valorTotalECondicoes = valorTotalECondicoes;
        this.dataValidade = dataValidade;
    }

    public Proposta(Lead lead, Plano plano, double valorTotalECondicoes, LocalDate dataValidade)
    {
        this(null, lead, plano, valorTotalECondicoes, dataValidade);
    }

    public Long getIdProposta() {
        return idProposta;
    }
    public Lead getLead() {
        return lead;
    }
    public Plano getPlano() {
        return plano;
    }
    public double getValorTotalECondicoes() {
        return valorTotalECondicoes;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
}
