package Models.Gestao;

public class Cargos
{
    private final Long idCargo;
    private final String cargoTitulo;
    private final String cargoDescricao;

    public Cargos(Long idCargo, String cargoTitulo, String cargoDescricao) {
        this.idCargo = idCargo;
        this.cargoTitulo = cargoTitulo;
        this.cargoDescricao = cargoDescricao;
    }

    public Cargos(String cargoTitulo, String cargoDescricao)
    {
        this(null, cargoTitulo, cargoDescricao);
    }

    public Long getIdCargo() {
        return idCargo;
    }
    public String getCargoTitulo() {
        return cargoTitulo;
    }
    public String getCargoDescricao() {
        return cargoDescricao;
    }
}
