package ProjetoBase;

import Models.Central.Funcionario;
import Util.Ferramentas;

public class VALIDACAOFuncionario
{
    public static void validacaoSenha(String senha)
    {
        boolean contemLetra = false;
        boolean contemCaracter = false;
        boolean contemNumero = false;

        if(senha.isBlank())
        {
            throw new IllegalArgumentException("ERRO! A SENHA NÃO PODE SER VAZIA");
        }
        if(senha.length() < 10)
        {
            throw new IllegalArgumentException("ERRO! A SENHA DEVE CONTER MAIS QUE 10 CARACTERES");
        }

        for(String letra : Ferramentas.listaMaiusculos)
        {
            if(senha.contains(letra))
            {
                contemLetra = true;
                break;
            }
        }
        if(!contemLetra)
        {
            throw new IllegalArgumentException("ERRO! A SENHA DEVE CONTER LETRAS MAIÚSCULAS");
        }

        for(String caracter : Ferramentas.listaEspeciais)
        {
            if(senha.contains(caracter))
            {
                contemCaracter = true;
                break;
            }
        }
        if(!contemCaracter)
        {
            throw new IllegalArgumentException("ERRO! A SENHA DEVE CONTER CARACTERES ESPECIAIS");
        }

        for(String numero : Ferramentas.listaNumeros)
        {
            if(senha.contains(numero))
            {
                contemNumero = true;
                break;
            }
        }
        if(!contemNumero)
        {
            throw new IllegalArgumentException("ERRO! A SENHA DEVE CONTER NÚMEROS");
        }
    }
    public static void validacaoSalario(double salario)
    {
        if(salario == 0)
        {
            throw new IllegalArgumentException("ERRO! O SALÁRIO NÃO PODE SER ZERO");
        }

        if(salario < 1000)
        {
            throw new IllegalArgumentException("ERRO! O SALARIO NÃO PODE SER MENOR DO QUE R$1000,00");
        }
    }
    /*public static void validacaoCargo(String cargo)
    {
        boolean contemCargo = false;

        if(cargo.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O CARGO NÃO PODE SER VAZIO");                     //PRECISA CONSERTAR ESSE AQUI / NN TEM MAIS A LISTA
        }

        for(String cargos : listaCargos)
        {
            if (!cargo.contains(cargos))
            {
                contemCargo = true;
                break;
            }
        }
        if(!contemCargo)
        {
            throw new IllegalArgumentException("ERRO! O CARGO ESCOLHIDO DEVE ESTAR EM NOSSAS OPÇÕES");
        }
    }
*/
    public static void validarNivelAcesso(int nivelAcesso)
    {
        if(nivelAcesso > 6 || nivelAcesso < 1)
        {
            throw new IllegalArgumentException("ERRO! NIVEL DE ACESSO INVÁLIDO");
        }
    }

    public static void temNivelAcesso1(Funcionario funcionario) //NIVEL DO SECRETARIO
    {
        if(!(funcionario.getNivelAcesso() == 1))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso2(Funcionario funcionario) // NIVEL DO VENDEDOR
    {
        if(!(funcionario.getNivelAcesso() == 2))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso3(Funcionario funcionario) //NIVEL DO PROFESSOR
    {
        if(!(funcionario.getNivelAcesso() == 3))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso4(Funcionario funcionario) //NIVEL DO DIRETOR
    {
        if(!(funcionario.getNivelAcesso() == 4))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso5(Funcionario funcionario) //NIVEL DO
    {
        if(!(funcionario.getNivelAcesso() == 5))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
}
