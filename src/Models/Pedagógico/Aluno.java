package Models.Pedagógico;

import Models.Central.Listas;
import Models.Central.PessoaModel;

public class Aluno extends PessoaModel
{
    /*Atributos:
    nome, CPF, e-mail, telefone
    lista de turmas
    lista de notas
    contrato (vinculado ao setor financeiro/comercial)

    Ações possíveis:
    visualizar turmas e horários
    registrar presença (feito indiretamente via aula)
    consultar notas e histórico
    verificar status do contrato e pagamento (integração financeira)*/

    private String telefone;

    public Aluno(String nome, String cpf, String email, String telefone)
    {
        super(nome, cpf, email);
        this.telefone = telefone;

        Listas.aluno.add(this);
    }

    public String getTelefone()
    {
        return telefone;
    }
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public static void validacaoTelefone(String telefone)
    {
        boolean contemCaracter = false;
        boolean contemLetra = false;

        if(telefone.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O TELEFONE NÃO PODE SER VAZIO");
        }

        for(String caracter : Ferramentas.listaEspeciais)
        {
            if(telefone.contains(caracter))
            {
                contemCaracter = true;
            }
        }
        if(contemCaracter)
        {
            throw new IllegalArgumentException("ERRO! O TELEFONE NÃO PODE CONTER CARACTERES");
        }

        for(String letra : Ferramentas.listaMinusculas)
        {
            if(telefone.contains(letra))
            {
                contemLetra = true;
            }
        }
        if(contemLetra)
        {
            throw new IllegalArgumentException("ERRO! O TELEFONE NÃO PODE COTER LETRAS");
        }
    }
}
