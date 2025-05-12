package talytapantoja.com.github.screenmatch.modelos;

public class Filme extends Titulo {
    private int duracaoEmMinutos;

    public void exibeFichaTecnicaFilme(){
        super.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        if (isIncluidoNoPlano()){
            System.out.println("Faz parte do seu plano. Assista agora mesmo!");
        } else {
            System.out.println("Não faz parte do seu plano. Adquira agora mesmo!");
        }
        System.out.println("");
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void avalia(int avalia) {
    }
}