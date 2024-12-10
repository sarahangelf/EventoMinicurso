package brasil.sousa.ifpb;

import java.util.ArrayList;

public class Minicurso extends Evento{
    public Minicurso(String nome, String data, String local, ArrayList<Minicurso> minicursos, ArrayList<Pessoa> participantes) {
        super(nome, data, local, participantes);
    }

    private String professor;
    private ArrayList <Aluno> inscritos;

    public Minicurso(String nome, String data, String local, ArrayList<Minicurso> minicursos, ArrayList<Pessoa> participantes, String professor, ArrayList<Aluno> inscritos) {
        super(nome, data, local, participantes);
        this.professor = professor;
        this.inscritos = inscritos;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Aluno> inscritos) {
        this.inscritos = inscritos;
    }

    public void adicionarInscrito (Aluno aluno){
        inscritos.add(aluno);
    }
}
