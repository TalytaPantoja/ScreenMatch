package talytapantoja.com.github.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;

    public void exibeFichaTecnica(){
        System.out.println("");
        System.out.println("Nome do titulo: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }


    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
}
