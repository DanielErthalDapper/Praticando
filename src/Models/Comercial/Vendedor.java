package Models.Comercial;

import Models.Central.FuncionarioModel;

public class Vendedor extends FuncionarioModel
{
    private double metasMensais;
    private int contratosFechadosNoMes;
    private double salarioComissao;

    public Vendedor(String nome, String cpf, String email, String senha,
                    double salario, String cargo, int nivelAcesso,
                    double metasMensais, int contratosFechadosNoMes, double salarioComissao) {
        super(nome, cpf, email, senha, salario, cargo, nivelAcesso);
        this.metasMensais = metasMensais;
        this.contratosFechadosNoMes = contratosFechadosNoMes;
        this.salarioComissao = salarioComissao;
    }

    public double getMetasMensais() {
        return metasMensais;
    }
    public void setMetasMensais(double metasMensais) {
        this.metasMensais = metasMensais;
    }
    public double getSalarioComissao() {
        return salarioComissao;
    }

    public int getContratosFechadosNoMes() {
        return contratosFechadosNoMes;
    }
    public void setContratosFechadosNoMes(int contratosFechadosNoMes) {
        this.contratosFechadosNoMes = contratosFechadosNoMes;
    }
    public void setSalarioComissao(double salarioComissao) {
        this.salarioComissao = salarioComissao;
    }
    //VALIDAÇÕES DE METAMENSAL E CONTRATOS FECHADOS AO MÊS
}
