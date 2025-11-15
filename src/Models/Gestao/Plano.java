package Models.Gestao;

public class Plano
{
    private final Long idplano;
    private final String nomePlano;
    private final int valorPlano;
    private final int cargaHorariaSemanal;

    public Plano(Long idplano, String nomePlano, int valorPlano, int cargaHorariaSemanal) {
        this.idplano = idplano;
        this.nomePlano = nomePlano;
        this.valorPlano = valorPlano;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public Long getIdplano() {
        return idplano;
    }
    public String getNomePlano() {
        return nomePlano;
    }
    public int getValorPlano() {
        return valorPlano;
    }
    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }
}
