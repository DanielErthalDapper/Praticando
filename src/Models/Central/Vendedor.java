package Models.Central;

import Models.Gestao.Cargos;

import java.time.LocalDate;

public class Vendedor extends Funcionario
{
    private final double metasMensais;
    private final int contratosFechadosNoMes;
    private final double salarioComissao;

    public Vendedor(Long idVendedor, String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, double metasMensais, int contratosFechadosNoMes, double salarioComissao) {
        super(idVendedor, nome, cpf, email, salario, dataContratacao, cargo);
        this.metasMensais = metasMensais;
        this.contratosFechadosNoMes = contratosFechadosNoMes;
        this.salarioComissao = salarioComissao;
    }

    public Vendedor(String nome, String cpf, String email, double salario, LocalDate dataContratacao, Cargos cargo, double metasMensais, int contratosFechadosNoMes, double salarioComissao)
    {
        this(null, nome, cpf, email, salario, dataContratacao, cargo, metasMensais, contratosFechadosNoMes, salarioComissao);
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
