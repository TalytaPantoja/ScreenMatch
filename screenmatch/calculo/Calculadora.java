package talytapantoja.com.github.screenmatch.calculo;

import talytapantoja.com.github.screenmatch.modelos.Filme;
import talytapantoja.com.github.screenmatch.modelos.Serie;
import talytapantoja.com.github.screenmatch.modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        if (titulo instanceof Serie serie) {
            int duracaoTotal = serie.getTemporadas() * serie.getEpisodiosPorTemporada() * serie.getMinutosPorEpisodio();
            this.tempoTotal += duracaoTotal;
        } else if (titulo instanceof Filme filme) {
            this.tempoTotal += filme.getDuracaoEmMinutos();
        }
    }
}
