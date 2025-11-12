package Models.Central;

import Util.Ferramentas;

public abstract class PessoaModel
{
    private final String nome;
    private final String cpf;
    private final String email;
    private final Long idPessoa;

    // -----  CONSTRUTOR COM ID  ----- //
    public PessoaModel(Long idPessoa, String nome, String cpf, String email) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // -  CONSTRUTOR SEM ID  - //
    public PessoaModel(String nome, String cpf, String email)
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
