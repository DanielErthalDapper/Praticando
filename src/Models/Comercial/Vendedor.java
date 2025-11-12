package Models.Comercial;

import Models.Central.FuncionarioModel;
import Models.Gestao.Cargos;

public class Vendedor extends FuncionarioModel
{
    private final double metasMensais;
    private final int contratosFechadosNoMes;
    private final double salarioComissao;

    public Vendedor(Long idVendedor, String nome, String cpf, String email, String senha, double salario, Cargos cargo, int nivelAcesso, double metasMensais, int contratosFechadosNoMes, double salarioComissao) {
        super(nome, cpf, email, senha, salario, cargo, nivelAcesso);
        this.metasMensais = metasMensais;
        this.contratosFechadosNoMes = contratosFechadosNoMes;
        this.salarioComissao = salarioComissao;
    }

    public Vendedor(String nome, String cpf, String email, String senha, double salario, Cargos cargo, int nivelAcesso, double metasMensais, int contratosFechadosNoMes, double salarioComissao)
    {
        this(null, nome, cpf, email, senha, salario, cargo, nivelAcesso, metasMensais, contratosFechadosNoMes, salarioComissao);
    }

    public double getMetasMensais() {
        return metasMensais;
    }
    public double getSalarioComissao() {
        return salarioComissao;
    }
    public int getContratosFechadosNoMes() {
        return contratosFechadosNoMes;
    }
}
