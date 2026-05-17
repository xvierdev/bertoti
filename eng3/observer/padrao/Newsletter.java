package observer.padrao;

import java.util.ArrayList;
import java.util.List;

public class Newsletter {
    private List<Observer> inscritos = new ArrayList<>();

    public void adicionarInscrito(Observer inscrito) {
        inscritos.add(inscrito);
    }

    public void removerInscrito(Observer inscrito) {
        inscritos.remove(inscrito);
    }

    public void postarNoticia(String noticia) {
        System.out.println("Newsletter postando: " + noticia);
        for (Observer inscrito : inscritos) {
            inscrito.update(noticia);
        }
    }
}
