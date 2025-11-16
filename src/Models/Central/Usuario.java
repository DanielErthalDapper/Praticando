package Models.Central;

import Models.Central.Enum.NivelAcesso;

public class Usuario
{
    private final Long idUsuario;
    private final String login;
    private final String senha;
    private final NivelAcesso nivelAcesso;
    private boolean ativo = true;

    public Usuario(Long idUsuario, String login, String senha, NivelAcesso nivelAcesso, boolean ativo) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.ativo = ativo;
    }

    public Usuario(String login, String senha, NivelAcesso nivelAcesso, boolean ativo)
    {
        this(null, login, senha, nivelAcesso, true);
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
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
