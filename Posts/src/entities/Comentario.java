package entities;

import java.util.Date;

public class Comentario {
    private static int idTexto = 1;
    private int idNext;
    private String nome;
    private String texto;
    private Date data;

    public Comentario(){
    }

    public Comentario(String texto, String nome){
        this.texto = texto;
        this.nome = nome;
        this.idNext = idTexto++;
        this.data = new Date();
    }

    public String getTexto() {
        return texto;
    }

    public String getNome(){
        return nome;
    }

    public int getIdNext() {
        return idNext;
    }

    public Date getData() {
        return data;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
