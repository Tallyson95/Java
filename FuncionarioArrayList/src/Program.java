    import entities.Funcionario;

    import java.util.*;

    public class Program {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            List<Funcionario> funcionariosList = new ArrayList<>();
            funcionariosList.add(new Funcionario(123, "Tallyson", 3000.0, 'M'));
            funcionariosList.add(new Funcionario(124, "Anelise", 3500.0, 'F'));
            funcionariosList.add(new Funcionario(125, "VItória", 4160.0 , 'F'));
            funcionariosList.add(new Funcionario(126, "THalyta", 5000.0, 'F'));

            System.out.println("Lista atual após a criação dos objetos: \n");
            for(Funcionario elements : funcionariosList){
                System.out.printf("Id: %d, nome: %s, salario: %.2f\n", elements.getId(), elements.getNome(), elements.getSalario());
            }

            System.out.println("Digite o id do usuário que deseja aumentar o salario: ");
            int idUser = sc.nextInt();
            String nome = funcionariosList.stream().filter(item -> item.getId() == idUser).findFirst()
                    .map(Funcionario::getNome).orElse(null);

            int i = 1;
            boolean encontrou = false;
            for(Funcionario elements : funcionariosList){
                if(elements.getId() != idUser){
                    i++;

                }else{

                    if(funcionariosList.size() == i){
                        encontrou = true;
                    }

                }
            }

            if(!encontrou){
                System.out.println("FUncionário não existe!!");;
            }else{
                System.out.println("Quanto gostaria de aumentar o salario do(a) " + nome + " ?" );
                double porcentagem = sc.nextDouble();

                int posicao = 0;

                for(Funcionario elements : funcionariosList){
                    if(elements.getId()  != idUser){
                        posicao++;
                    }else{
                        break;
                    }

                }



                System.out.println(funcionariosList.get(posicao).aumentarSalario(porcentagem));

                System.out.println("\nLista após aumento salarial do(a) " + nome);
                for(Funcionario elements : funcionariosList){
                    System.out.printf("Id: %d, nome: %s, salario: %.2f\n", elements.getId(), elements.getNome(), elements.getSalario());
                }
            }



        }
    }
