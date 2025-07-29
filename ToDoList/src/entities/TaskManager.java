package entities;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Tasks> myList = new ArrayList<Tasks>();
    private int nextId = 10;

    public void addTask(Tasks tarefa) {
        myList.add(tarefa);
    }

    public int getNextId() {
        return nextId++;
    }

    public void listarTasks() {
        if (myList.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada!");
            return;
        }

        for (Tasks elements : myList) {
            System.out.println(elements.toString());

        }
    }

    public Boolean removerTask(int id){
        boolean remocao = false;
        if(myList.isEmpty() || id <= 0){
            return false;
        }
        int i = 0;


        for(Tasks elements : myList){
            if(elements.getId() == id){
                remocao = true;
                break;
            }
            i++;
        }
        if(remocao){
            myList.remove(i);
        }
        return remocao;
    }
}
