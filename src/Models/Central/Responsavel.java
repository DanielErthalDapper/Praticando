package Models.Central;

public class Responsavel extends Pessoa
{
    private final String telefone;

    // -- CONSTRUTOR COM ID -- //
    public Responsavel(Long idResponsavel, String nome, String cpf, String email, String telefone)
    {
        super(idResponsavel, nome, cpf, email);
        this.telefone = telefone;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Responsavel(String nome, String cpf, String email, String telefone)
    {
        this(null, nome, cpf, email, telefone);
    }

    public String getTelefone()
    {
        return telefone;
    }
}
