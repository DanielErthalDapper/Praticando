package Models.Pedagógico;

import java.sql.Date;

public class Nota
{
    private final Long idNota;
    private final double valorDaNota;
    private final Date dataLancamento;

    public Nota(Long idNota, Date dataLancamento, double valorDaNota) {
        this.idNota = idNota;
        this.dataLancamento = dataLancamento;
        this.valorDaNota = valorDaNota;
    }

    public Nota(Date dataLancamento, double valorDaNota) {
        this(null, dataLancamento, valorDaNota);
    }

    public Long getIdNota() {
        return idNota;
    }
    public double getValorDaNota() {
        return valorDaNota;
    }
    public Date getDataLancamento() {
        return dataLancamento;
    }
}
