public class Program {
    public static void main(String[] args){
        int boxing = 100;
        Object objX = boxing;

        System.out.println("O valor do objeto boxing é: " + objX + " e o valor da variavel boxin é: " + boxing);
        int newUnboxing = (int) objX;
        System.out.println("unboxing " + (newUnboxing - 50));

        String[] vet = new String[] {"Maria", "Bob", "ALex"};
        for(String nameObj : vet){
            System.out.println(nameObj);
        }
    }
}
