package Models.Central;

public abstract class Pessoa
{
    private final String nome;
    private final String cpf;
    private final String email;
    private final Long idPessoa;

    // -----  CONSTRUTOR COM ID  ----- //
    public Pessoa(Long idPessoa, String nome, String cpf, String email) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // -  CONSTRUTOR SEM ID  - //
    public Pessoa(String nome, String cpf, String email)
    {
        this(null, nome, cpf, email);
    }


    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
}
