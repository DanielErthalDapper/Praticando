package ProjetoBase;

import Util.Ferramentas;

public class VALIDACAOPessoa
{
    public static void validacaoNome(String nome)
    {
        boolean contemNumero = false;
        boolean contemCaracter = false;

        if(nome.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O NOME NÃO PODE SER VAZIO");
        }

        if(nome.length() < 3)
        {
            throw new IllegalArgumentException("ERRO! O NOME PRECISA TER MAIS QUE 3 CARACTERES");
        }

        for(String numero : Ferramentas.listaNumeros)
        {
            if(nome.contains(numero))
            {
                contemNumero = true;
                break;
            }
        }
        if(contemNumero)
        {
            throw new IllegalArgumentException("ERRO! O NOME NÃO PODE CONTER NÚMEROS");
        }

        for(String caracter : Ferramentas.listaEspeciais)
        {
            if(nome.contains(caracter))
            {
                contemCaracter = true;
                break;
            }
        }
        if(contemCaracter)
        {
            throw new IllegalArgumentException("ERRO! O NOME NÃO PODE CONTER CARACTERES ESPECIAIS");
        }
    }
    public static void validacaoCPF(String cpf)
    {
        boolean contemLetra = false;
        boolean contemCaracter = false;

        if(cpf.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O CPF NÃO PODE SER VAZIO");
        }
        if(cpf.length() != 11)
        {
            throw new IllegalArgumentException("ERRO! O CPF DEVE TER 11 DIGITOS");
        }

        for(String letra : Ferramentas.listaMaiusculos)
        {
            if(cpf.contains(letra))
            {
                contemLetra = true;
                break;
            }
        }
        if(contemLetra)
        {
            throw new IllegalArgumentException("ERRO! O CPF NÃO PODE CONTER LETRAS");
        }

        for(String caracter : Ferramentas.listaEspeciais)
        {
            if(cpf.contains(caracter))
            {
                contemCaracter = true;
                break;
            }
        }
        if(contemCaracter)
        {
            throw new IllegalArgumentException("ERRO! O CPF NÃO PODE CONTER CARACTERES ESPECIAIS");
        }
    }
    public static void validacaoEmail(String email)
    {
        boolean contemLetra = false;
        boolean contemCaracter = false;
        boolean contemNumero = false;

        if(email.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O EMAIL NÃO PODE SER VAZIO");
        }
        if(email.length() < 10)
        {
            throw new IllegalArgumentException("ERRO! O EMAIL DEVE CONTER MAIS QUE 10 CARACTERES");
        }
        if(!email.contains("@gmail.com"))
        {
            throw new IllegalArgumentException("ERRO! O EMAIL DEVE TERMINAR COM '@gmail.com'");
        }

        for(String letra : Ferramentas.listaMaiusculos)
        {
            if(email.contains(letra))
            {
                contemLetra = true;
                break;
            }
        }
        if(!contemLetra)
        {
            throw new IllegalArgumentException("ERRO! O EMAIL DEVE CONTER LETRAS MAIÚSCULAS");
        }

        for(String caracter : Ferramentas.listaEspeciais)
        {
            if(email.contains(caracter))
            {
                contemCaracter = true;
                break;
            }
        }
        if(!contemCaracter)
        {
            throw new IllegalArgumentException("ERRO! O EMAIL DEVE CONTER CARACTERES ESPECIAIS");
        }

        for(String numero : Ferramentas.listaNumeros)
        {
            if(email.contains(numero))
            {
                contemNumero = true;
                break;
            }
        }
        if(!contemNumero)
        {
            throw new IllegalArgumentException("ERRO! O EMAIL DEVE CONTER NÚMEROS");
        }
    }
}
