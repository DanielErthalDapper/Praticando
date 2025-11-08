package Models.Central;

import Util.Ferramentas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class FuncionarioModel extends PessoaModel
{
    private String senha;
    private double salario;
    private String cargo;
    private int nivelAcesso;
    public static final List<String> listaCargos = new ArrayList<>(Arrays.asList
            ("Professor", "Secretário", "Vendedor", "CDA", "BDR",
                    "Professor", "Coordenador Comercial", "Coordenador Pedagógico"));

    public FuncionarioModel(String nome, String cpf, String email, String senha, double salario, String cargo, int nivelAcesso) {
        super(nome, cpf, email);
        this.senha = senha;
        this.salario = salario;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

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
    public static void validacaoCargo(String cargo)
    {
        boolean contemCargo = false;

        if(cargo.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O CARGO NÃO PODE SER VAZIO");
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

    public static void validarNivelAcesso(int nivelAcesso)
    {
        if(nivelAcesso > 6 || nivelAcesso < 1)
        {
            throw new IllegalArgumentException("ERRO! NIVEL DE ACESSO INVÁLIDO");
        }
    }

    public static void temNivelAcesso1(FuncionarioModel funcionario) //NIVEL DO SECRETARIO
    {
        if(!(funcionario.getNivelAcesso() == 1))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso2(FuncionarioModel funcionario) // NIVEL DO VENDEDOR
    {
        if(!(funcionario.getNivelAcesso() == 2))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso3(FuncionarioModel funcionario) //NIVEL DO PROFESSOR
    {
        if(!(funcionario.getNivelAcesso() == 3))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso4(FuncionarioModel funcionario) //NIVEL DO DIRETOR
    {
        if(!(funcionario.getNivelAcesso() == 4))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
    public static void temNivelAcesso5(FuncionarioModel funcionario) //NIVEL DO
    {
        if(!(funcionario.getNivelAcesso() == 5))
        {
            throw new IllegalArgumentException("ERRO! FALTA DE PERMISSÃO");
        }
    }
}
