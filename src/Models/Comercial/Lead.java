package Models.Comercial;

import Models.Central.Pessoa;
import Models.Comercial.Enum.Origem;
import Models.Comercial.Enum.StatusLead;

public class Lead extends Pessoa
{
    private String telefone;
    private String idiomaDeInteresse;
    private Origem origem;
    private StatusLead status;

    public Lead(long idPessoa, String nome, String cpf, String email,
                String telefone, String idiomaDeInteresse, Origem origem, StatusLead status) {
        super(idPessoa, nome, cpf, email);
        this.telefone = telefone;
        this.idiomaDeInteresse = idiomaDeInteresse;
        this.origem = origem;
        this.status = status;
    }

    public Lead(String nome, String cpf, String email, String telefone, String idiomaDeInteresse, Origem origem, StatusLead status) {
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
    public Origem getOrigem() {
        return origem;
    }
    public void setOrigem(Origem origem) {
        this.origem = origem;
    }
    public StatusLead getStatus() {
        return status;
    }
    public void setStatus(StatusLead status) {
        this.status = status;
    }

    //VALIDAÇÃO DE TELEFONE, IDIOMA DE INTERESSE, ORIGEM E STATUS
}
