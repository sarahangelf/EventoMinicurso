package brasil.sousa.ifpb;

import java.util.ArrayList;

public class CriadorDeEvento extends Pessoa{

    public CriadorDeEvento(String nome) {
        super(nome);
    }

    private ArrayList <Evento> eventosCriados;

    public CriadorDeEvento(String nome, ArrayList<Evento> eventosCriados) {
        super(nome);
        this.eventosCriados = eventosCriados;
    }

    public ArrayList<Evento> getEventosCriados() {
        return eventosCriados;
    }

    public void setEventosCriados(ArrayList<Evento> eventosCriados) {
        this.eventosCriados = eventosCriados;
    }

    public void criarEvento (Evento evento) {
        eventosCriados.add(evento);
    }
}
