package Models.Central;

import Models.Central.Enum.NivelAcesso;

public class Usuario
{
    private final Long idUsuario;
    private final String login;
    private final String senha;
    private final NivelAcesso nivelAcesso;

    public Usuario(Long idUsuario, String login, String senha, NivelAcesso nivelAcesso) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String login, String senha, NivelAcesso nivelAcesso)
    {
        this(null, login, senha, nivelAcesso);
    }

    public Long getIdUsuario() {
        return idUsuario;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }
}
