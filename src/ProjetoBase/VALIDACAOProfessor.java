package ProjetoBase;

public class VALIDACAOProfessor
{
    public static void validacaoEspecialidade(String especialidadeIdioma)
    {
        boolean contemEspecialidade = false;

        if(especialidadeIdioma.isBlank())
        {
            throw new IllegalArgumentException("ERRO! A ESPECIALIDADE NÃO PODE SER VAZIO");
        }

        for(String especialidade : Listas.listaIdiomas)
        {
            if(especialidadeIdioma.contains(especialidade))
            {
                contemEspecialidade = true;
            }
        }
        if(!contemEspecialidade)
        {
            throw new IllegalArgumentException("ERRO! A ESPECIALIDADE DEVE ESTAR EM NOSSAS OPÇÕES");
        }
    }
}
