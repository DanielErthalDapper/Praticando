package ProjetoBases.Pedagógico;

import ProjetoBases.Central.Listas;

public class Presenca
{
    /*Atributos:
aluno
status (presente/falta)
data

Ações possíveis:
registrar presença ou falta
emitir relatório de frequência por aluno*/

    private String presenca;

    public Presenca(String  presenca)
    {
        this.presenca = presenca;

        Listas.presenca.add(this);
    }

    public String getPresenca()
    {
        return presenca;
    }

    public void setPresente(String presenca)
    {
        this.presenca = presenca;
    }

    public static void validarPresenca(String presenca)
    {
        if(!presenca.equals("C") || presenca.equals("F"))
        {
            throw new IllegalArgumentException("ERRO! PRESENCA DEVE SER 'C' OU 'F'");
        }
    }
}
