package brasil.sousa.ifpb;

public class Aluno extends Pessoa{

    public Aluno(String nome) {
        super(nome);
    }

    private String instituicao;

    public Aluno(String nome, String instituicao) {
        super(nome);
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}