package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static int nextId = 10; // Agora é estático, compartilhado entre todos os posts
    private int id; // Armazena o ID fixo do post

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {}

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.id = nextId++; // Gera e armazena o ID no momento da criação
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public int getId() {
        return id;
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

    public void setTitulo(String titulo){
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

    public List<Comentario> getComentarios() {
        return comentarios;
    }


    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario){
        comentarios.remove(comentario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

        sb.append("Post ID: ").append(id).append("\n"); // Agora imprime o ID fixo
        sb.append("Momento: ").append(sdf.format(momento)).append("\n");
        sb.append("Título: ").append(titulo).append("\n");
        sb.append("Conteúdo: ").append(conteudo).append("\n");
        sb.append("Likes: ").append(likes).append("\n");
        sb.append("Comentários:\n");
        for (Comentario c : comentarios) {
            sb.append("- ").append(c.getNome()).append(": ").append(c.getTexto()).append("\n");
            sb.append("   Data: ").append(sdf.format(c.getData())).append("\n");
        }

        return sb.toString();
    }
}

