package Models.Central;

public class Aluno extends Pessoa
{
    private final String telefone;

    // -- CONSTRUTOR COM ID -- //
    public Aluno(Long idAluno, String nome, String cpf, String email, String telefone)
    {
        super(idAluno, nome, cpf, email);
        this.telefone = telefone;
    }

    // -- CONSTRUTOR SEM ID -- //
    public Aluno(String nome, String cpf, String email, String telefone)
    {
        this(null, nome, cpf, email, telefone);
    }

    public String getTelefone()
    {
        return telefone;
    }
}
