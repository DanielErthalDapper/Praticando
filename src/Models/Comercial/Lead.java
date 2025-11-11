package Models.Comercial;

import Models.Central.PessoaModel;

public class Lead extends PessoaModel
{
    private String telefone;
    private String idiomaDeInteresse;
    private String origem;
    private String status;

    public Lead(long idPessoa, String nome, String cpf, String email,
                String telefone, String idiomaDeInteresse, String origem, String status) {
        super(idPessoa, nome, cpf, email);
        this.telefone = telefone;
        this.idiomaDeInteresse = idiomaDeInteresse;
        this.origem = origem;
        this.status = status;
    }

    public Lead(String nome, String cpf, String email, String telefone, String idiomaDeInteresse, String origem, String status) {
        super(nome, cpf, email);
        this.telefone = telefone;
        this.idiomaDeInteresse = idiomaDeInteresse;
        this.origem = origem;
        this.status = status;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getIdiomaDeInteresse() {
        return idiomaDeInteresse;
    }
    public void setIdiomaDeInteresse(String idiomaDeInteresse) {
        this.idiomaDeInteresse = idiomaDeInteresse;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //VALIDAÇÃO DE TELEFONE, IDIOMA DE INTERESSE, ORIGEM E STATUS
}
