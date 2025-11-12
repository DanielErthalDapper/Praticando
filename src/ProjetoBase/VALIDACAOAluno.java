package ProjetoBase;

import Util.Ferramentas;

public class VALIDACAOAluno
{
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
