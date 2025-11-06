package ProjetoBases.Pedagógico;

import ProjetoBases.Central.Listas;

import java.util.ArrayList;
import java.util.List;

public class NumeroTurma
{
    public static void validacaoNumeroTurma(int numeroTurma)
    {
        boolean contemTurma = false;

        if(numeroTurma == 0 || numeroTurma < 0)
        {
            throw new IllegalArgumentException("ERRO! NÚMERO DE TURMA IGUAL A ZERO");
        }

        for(NumeroTurma numero : Listas.numeroTurma)
        {
            if(numero.equals(numeroTurma))
            {
                contemTurma = true;
                break;
            }
        }
        if(contemTurma)
        {
            throw new IllegalArgumentException("ERRO! NÚMERO DE TURMA JÁ EXISTE");
        }
    }
}
