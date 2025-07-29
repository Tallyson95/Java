package entities;

import entities.enums.TaskStatus;
import java.util.Date;

public class Tasks {
    private int id;
    private Date data;
    private String descricao;
    private TaskStatus status;

    public Tasks(int id, Date data, String descricao, TaskStatus status){
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId(){
        return this.id;
    }

    public Date getData(){
        return this.data;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public TaskStatus getStatus(){
        return this.status;
    }


    public String toString(){
        return "Id: " + getId() + ", Data: " + getData() + ", Descrição: " + getDescricao() + ", Status: " + getStatus();
    }
}
