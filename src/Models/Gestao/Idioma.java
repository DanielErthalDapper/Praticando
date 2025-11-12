package Models.Gestao;

public class Idioma
{
    private Long idIdioma;
    private String idioma;

    public Idioma(Long idIdioma, String idioma)
    {
        this.idIdioma = idIdioma;
        this.idioma = idioma;
    }

    public Idioma(String idioma)
    {
        this(null, idioma);
    }

    public String getIdioma() {
        return idioma;
    }
    public Long getIdIdioma() {
        return idIdioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
