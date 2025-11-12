package Models.Gestao;

public class Sala
{
    private Long idSala;
    private String nomeSala;

    // -- CONSTRUTOR COM ID -- //
    public Sala(Long idSala, String sala)
    {
        this.idSala = idSala;
        this.nomeSala = sala;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Sala(String nomeSala)
    {
        this(null, nomeSala);
    }

    public String getNomeSala() {
        return nomeSala;
    }
    public Long getIdSala() {
        return idSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }
}
