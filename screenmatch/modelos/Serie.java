package talytapantoja.com.github.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public void exibeFichaTecnicaSerie(){
        super.exibeFichaTecnica();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
        System.out.println("Minutos por episódio: " + minutosPorEpisodio);
        if (isIncluidoNoPlano()){
            System.out.println("Faz parte do seu plano. Assista agora mesmo!");
        } else {
            System.out.println("Não faz parte do seu plano. Adquira agora mesmo!");
        }
        System.out.println("");
    }

    //getters
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //setters
    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void avalia(int avaliacao) {

    }
}
