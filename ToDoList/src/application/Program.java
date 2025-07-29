package application;

import entities.TaskManager;
import entities.Tasks;
import entities.enums.TaskStatus;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TaskManager gerenciar = new TaskManager();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char continuar;
        int opt;

        System.out.println("Iniciando programa!");
        do {
            System.out.println("Escolha uma opção válida: \n[1] - adicionar uma ou mais tarefas, \n" +
                    "[2] - Listar tarefas, \n[3] - remover uma tarefa pelo id");

            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    toDoList(sc, gerenciar);
                    break;
                case 2:
                    gerenciar.listarTasks();
                    break;
                case 3:
                    System.out.println("Digite o ID da tarefa que deseja remover: ");
                    int idRemover = sc.nextInt();
                    Boolean removido = gerenciar.removerTask(idRemover);

                    if (removido) {
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Id inválido ou não há tarefas adicionadas!");
                    }

                    break;
                default:
                    System.out.println("Opção inválida! Escolha [1], [2] ou [3].");

            }

            System.out.println("Deseja continuar? [S]/[N]: ");
            continuar = Character.toLowerCase(sc.next().charAt(0));

        } while ((opt >= 1 && opt <= 3) && continuar == 's');


        System.out.println("FIm do programa!");

        sc.close();
    }

    public static void toDoList(Scanner sc, TaskManager gerenciar) {
        System.out.println("Deseja criar quantas tarefas?: ");
        int quant = sc.nextInt();


        for (int i = 0; i < quant; i++) {
            System.out.println("Descrição da tarefa [" + (i + 1) + "]: ");
            sc.nextLine();
            String descricaoTask = sc.nextLine();

            System.out.println("Digite o nome do status desejado: \n[1] - FAZER,\n[2] - FAZENDO,\n[3] - FEITO");
            TaskStatus status = options(sc.nextInt());

            int id = gerenciar.getNextId();
            Tasks task = new Tasks(id, new Date(), descricaoTask, status);
            gerenciar.addTask(task);
        }

    }

    public static TaskStatus options(int statusTask) {
        switch (statusTask) {
            case 1:
                return TaskStatus.FAZER;
            case 2:
                return TaskStatus.FAZENDO;
            case 3:
                return TaskStatus.FEITO;
        }
        throw new IllegalArgumentException("Opção inválida: " + statusTask);
    }

}
