package com.example.posts.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String texto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public Comentario() {
    }

    public Comentario(String texto, String nome, Post post) {
        this.texto = texto;
        this.nome = nome;
        this.data = new Date();
        this.post = post;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}