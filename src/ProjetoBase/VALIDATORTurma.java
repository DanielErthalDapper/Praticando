package ProjetoBase;

public class VALIDATORTurma
{
    public static void validacaoIdioma(String idioma)
    {
        boolean contemIdiomas = false;

        if(idioma.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O IDIOMA NÃO PODE SER VAZIO");
        }

        for(String idiomas : Listas.listaIdiomas)
        {
            if(idioma.contains(idiomas))
            {
                contemIdiomas = true;
            }
        }
        if(!contemIdiomas)
        {
            throw new IllegalArgumentException("ERRO! O IDIOMA DEVE CONTER EM NOSSA LISTA");
        }
    }

    public static void validacaoProfessor(String professor)
    {
        if(professor.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O PROFESSOR NÃO PODE SER VAZIO");
        }

        if(!Listas.professor.contains(professor))
        {
            throw new IllegalArgumentException("ERRO! O PROFESSOR DEVE CONTER EM NOSSA LISTA");
        }
    }

    public static void validacaoSala(String sala)
    {
        boolean contemSala = false;

        if(sala.isBlank())
        {
            throw new IllegalArgumentException("ERRO! A SALA NÃO PODE SER VAZIA");
        }

        for(String salas : Listas.listaSalas)
        {
            if(sala.contains(salas))
            {
                throw new IllegalArgumentException("ERRO! A SALA DEVE CONTER EM NOSSA LISTA");
            }
        }
    }
}
