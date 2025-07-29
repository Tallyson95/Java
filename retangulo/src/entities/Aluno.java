package entities;

public class Aluno {
    public String name;
    public double av1;
    public double av2;
    public double av3;

    public String notaFinal(){
        if(av1 < 0 || av2 < 0 || av3 < 3){
            return "Uma ou mais notas invalidas, por favor, \ninsira notas" +
                    " entre 0 a 30 para av1" +
                    ", entre 0 a 35 para av2" +
                    ", entre 0 a 35 para av3";
        }

        if(av1 + av2 + av3 >= 60){
            return "Sua nota final é: " + (av1 + av2 + av3) + ". Aprovado!";
        }else{
            return "Sua nota final é: " + (av1 + av2 + av3) + ". Reprovado!";
        }

    }
}
