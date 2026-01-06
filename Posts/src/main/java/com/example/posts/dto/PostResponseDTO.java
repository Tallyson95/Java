package com.example.posts.dto;

import com.example.posts.model.Comentario;
import com.example.posts.model.Post;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PostResponseDTO {
    private Long id;
    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    private List<ComentarioDTO> comentarios;

    public PostResponseDTO() {
    }

    public PostResponseDTO(Long id, Date momento, String titulo, String conteudo, Integer likes,
            List<ComentarioDTO> comentarios) {
        this.id = id;
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
        this.comentarios = comentarios;
    }

    public static PostResponseDTO fromEntity(Post post) {
        List<ComentarioDTO> comentarios = post.getComentarios() != null
                ? post.getComentarios().stream().map(ComentarioDTO::fromEntity).collect(Collectors.toList())
                : null;
        return new PostResponseDTO(
                post.getId(),
                post.getMomento(),
                post.getTitulo(),
                post.getConteudo(),
                post.getLikes(),
                comentarios);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<ComentarioDTO> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<ComentarioDTO> comentarios) {
        this.comentarios = comentarios;
    }

    public static class ComentarioDTO {
        private Long id;
        private String nome;
        private String texto;
        private Date data;

        public static ComentarioDTO fromEntity(Comentario comentario) {
            ComentarioDTO dto = new ComentarioDTO();
            dto.id = comentario.getId();
            dto.nome = comentario.getNome();
            dto.texto = comentario.getTexto();
            dto.data = comentario.getData();
            return dto;
        }

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
    }
}