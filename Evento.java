package brasil.sousa.ifpb;

import java.util.ArrayList;

public class Evento {

    private String nome;
    private String data;
    private String local;
    private ArrayList <Pessoa> participantes;

    public Evento(String nome, String data, String local, ArrayList<Pessoa> participantes) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.participantes = participantes;
    }

    public Evento() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<Pessoa> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Pessoa> participantes) {
        this.participantes = participantes;
    }

    public void adicionarParticipante (Pessoa participante) {
        participantes.add(participante);
    }
}
