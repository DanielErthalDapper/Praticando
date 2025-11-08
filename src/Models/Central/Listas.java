package Models.Central;

import Models.Administrativo.Secretario;
import Models.Comercial.Vendedor;
import Models.Gestao.Diretor;
import Models.Pedagógico.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas
{
    //  ------------- LISTAS GERAIS UTILIZADAS PARA PESSOAS -------------  //
    public static final List<FuncionarioModel> funcionario = new ArrayList<>(); // UTILZADO NA HORA DO CADATRO / APÓS A IDA AO CONSTRUTOR ESPECÍFICO
    public static final List<PessoaModel> pessoa = new ArrayList<>();           // UTILIZADO NA HORA DO CADASTRO / APÓS O ADD DE FUNCIONARIO
    public static final List<Secretario> secretario = new ArrayList<>();   // UTILIZADO NA CLASSE SECRETARIO
    public static final List<Vendedor> vendedor = new ArrayList<>();       // UTILIZADO NA CLASSE VENDEDOR
    public static final List<Aluno> aluno = new ArrayList<>();             // UTILIZADO NA CLASSE ALUNO
    public static final List<Professor> professor = new ArrayList<>();     // UTILIZADO NA CLASSE PROFESSOR
    public static final List<Diretor> diretor = new ArrayList<>();         // UTILIZADO NA CLASSE DIRETOR

    //  -------------- LISTAS UTILIZADAS PARA O PEDAGÓGICO --------------  //
    public static final List<NumeroTurma> numeroTurma = new ArrayList<>();
    public static final List<Turma> turma = new ArrayList<>();
    public static final List<Presenca> presenca = new ArrayList<>();

    public static final List<String> listaIdiomas = new ArrayList<>(Arrays.asList("Inglês", "Espanhol", "Francês", "Alemão", "Italiano"));
    public static final List<String> listaSalas = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));
}
