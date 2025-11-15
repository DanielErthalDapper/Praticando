package Models.Administrativo;

import Models.Central.Aluno;
import Models.Gestao.Contrato;
import Models.Pedagógico.Boletim;
import Models.Pedagógico.OcorrenciasPedagógicas;

public class FichaAluno
{
    private Long idFicha;
    private Aluno aluno;
    private OcorrenciasPedagógicas ocorrencias;
    private Boletim boletim;
    //ComprovantesPagamento
    private Contrato contrato;
    //FichaComInfo(nome, cpf, senha, telefoneAl, responsavel + telefoneResp ...)

}
