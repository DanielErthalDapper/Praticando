package Models.Pedagógico;

import Models.Central.Aluno;

public class Boletim
{
    //para que o boletim seja realizado, é necessario que tenha 4 notas(cada nota representa uma prova de conhecimentos)
    private final Long idBoletim;
    private final Nota nota;
    private double valorFinal;
    private final Aluno aluno;

    public Boletim(Long idBoletim, Nota nota, double valorFinal, Aluno aluno) {
        this.idBoletim = idBoletim;
        this.nota = nota;
        this.valorFinal = valorFinal;
        this.aluno = aluno;
    }

    public Boletim(Nota nota, double valorFinal, Aluno aluno)
    {
        this(null, nota, valorFinal, aluno);
    }

    public Long getIdBoletim() {
        return idBoletim;
    }
    public Nota getNota() {
        return nota;
    }
    public double getValorFinal() {
        return valorFinal;
    }
    public Aluno getAluno() {
        return aluno;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
