import talytapantoja.com.github.screenmatch.calculo.Calculadora;
import talytapantoja.com.github.screenmatch.modelos.Filme;
import talytapantoja.com.github.screenmatch.modelos.Serie;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("A fuga das galinhas");
        filme.setAnoDeLancamento(2000);
        filme.setDuracaoEmMinutos(84);
        filme.setIncluidoNoPlano(true);

        filme.exibeFichaTecnicaFilme();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua avaliação para o filme: ");
        int avalia = scanner.nextInt();
        filme.avalia(avalia);

        Serie serie = new Serie();
        serie.setNome("Rick e Morty");
        serie.setAnoDeLancamento(2013);
        serie.setAtiva(true);
        serie.setTemporadas(8);
        serie.setEpisodiosPorTemporada(7);
        serie.setMinutosPorEpisodio(20);
        serie.setIncluidoNoPlano(true);

        serie.exibeFichaTecnicaSerie();

        System.out.println("Qual sua avaliação para a série: ");
        int avaliacao = scanner.nextInt();
        serie.avalia(avaliacao);
        scanner.close();

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(filme);
        calculadora.inclui(serie);
        System.out.println("Tempo em minutos para maratonar: " + calculadora.getTempoTotal());
    }
}
