package Models.Pedagógico;

public class Nota
{
    /*Atributos:
disciplina
valor da nota
aluno
data de lançamento

Ações possíveis:
registrar nota
recalcular média final
emitir boletim*/

    private double valorDaNota;

    public Nota(double valorDaNota)
    {
        this.valorDaNota = valorDaNota;
    }

    public double getValorDaNota()
    {
        return valorDaNota;
    }

    public void setValorDaNota(double valorDaNota)
    {
        this.valorDaNota = valorDaNota;
    }

    public static void validacaoNota(double valorDaNota)
    {
        if(valorDaNota < 0)
        {
            throw new IllegalArgumentException("ERRO! A NOTA NÃO PODE SER NEGATIVA");
        }
        if(valorDaNota > 10)
        {
            throw new IllegalArgumentException("ERRO! A NOTA NÃO PODE SER MAIOR QUE 10");
        }
    }
}
