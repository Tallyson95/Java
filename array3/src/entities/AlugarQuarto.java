package entities;

public class AlugarQuarto {
    private int numero;
    private String nomeInquilino;
    private String emailInquilino;

    private static int[] vetAlugados = new int[10];

    public AlugarQuarto(String nomeInquilino, String emailInquilino){
        this.nomeInquilino = nomeInquilino;
        this.emailInquilino = emailInquilino;
    }

    public String getNomeInquilino(){
        return this.nomeInquilino;
    }

    public Boolean verificarDisponibilidade(int numero){
        Boolean disponibilidade = true;
        for (int i = 0; i < 10; i++){
            if(vetAlugados[i] == numero){
                disponibilidade = false;
            }
        }
        return disponibilidade;
    }

    public String quartosDisponiveis() {
        String disponiveis = "Quartos disponíveis: ";
       for(int i = 0; i <= 10; i ++){
           if(verificarDisponibilidade(i)){
               disponiveis = disponiveis + i + " ";
           }
       }
       return disponiveis;
    }

    public String alugarUmQUarto (int numero){
        for(int i = 0; i < 10; i++){
            if(vetAlugados[i] == 0){
                if(verificarDisponibilidade(numero)){
                    vetAlugados[i] = numero;
                    return "Quarto " + numero + " alugado com sucesso!";
                }
            }
        }
        return "Quarto indisponível!";
    }
}
