package application;

import entities.Comentario;
import entities.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Post> postagens = new ArrayList<Post>();




        String resp;
        int opt;
        do {
            System.out.println("MENU: ");
            System.out.println("1. Criar post");
            System.out.println("2. Ler post");
            System.out.println("3. Comentar post");
            System.out.println("4. Excluir post");
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt){
                case 1:
                    System.out.println("Gostaria de fazer quantos posts?: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Título do post [" + (i + 1) + "]:");
                        String titulo = sc.nextLine();

                        System.out.println("Conteúdo do post [" + (i + 1) + "]:");
                        String conteudo = sc.nextLine();

                        LocalDateTime agora = LocalDateTime.now();
                        Date dataConvertida = Date.from(agora.atZone(ZoneId.systemDefault()).toInstant());
                        System.out.println(dataConvertida);

                        Post postagem = new Post(dataConvertida, titulo, conteudo, 0);
                        postagens.add(postagem);
                    }
                    break;
                case 2:
                    if(!isEmptyList(postagens)){
                        break;
                    }
                   lerPosts(postagens);
                    break;
                case 3:
                    if(!isEmptyList(postagens)){
                        break;
                    }
                    for (Post elements : postagens){
                        System.out.println(elements.toString());
                    }
                    System.out.println("Digite o ID do post que gostaria de comentar?");
                    int idPost = sc.nextInt();
                    sc.nextLine();

                    boolean comentou = false;
                    comentou = comentarPost(postagens, idPost, sc, comentou);
                    if (comentou){
                        System.out.println("Gostaria de dar like?: [ S ] - [ N ]");
                        String respLike = sc.nextLine().toUpperCase();
                        if(respLike.equals("S")){
                            System.out.println(like(postagens, idPost));
                        }

                    }

                    if(!comentou){
                        System.out.println("Post não encontrado!");
                    }
                    break;
                case 4:
                    if(!isEmptyList(postagens)){
                        break;
                    }
                    lerPosts(postagens);
                   removerPost(postagens, sc);
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

            System.out.println("Deseja continuar?" + " [ S ] - [ N ]");
            resp = sc.nextLine().toUpperCase();
        } while (resp.equals("S"));

        System.out.println("Encerrando programa!");
        sc.close();
    }

    public static boolean isEmptyList(List<Post> postagens){
        if(postagens.isEmpty()){
            System.out.println("Nenhum post criado!");
            return false;
        }
        return true;
    }

    public static boolean comentarPost(List<Post> postagens, int idPost, Scanner sc, boolean comentou){
        for (Post post : postagens) {
            if (post.getId() == idPost) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Escreva o seu comentário: ");
                String comentario = sc.nextLine();
                post.addComentario(new Comentario(comentario, nome));
                System.out.println("Comentário realizado com sucesso!");
                comentou = true;
                break;
            }
        }
        return comentou;
    }

    public static String like(List<Post> postagens, int idPost){
        for (Post post : postagens) {
            if (post.getId() == idPost) {
                post.darLike();
                 return "Like dado com sucesso";
            }
        }
        return "Não foi possivel dar like";
    }

    public static void removerPost(List<Post> postagens, Scanner sc){
        System.out.print("Digite o id do POST que deseja excluir: ");
        int idRemoverPost = sc.nextInt();
        sc.nextLine();

        boolean removido = false;

        for (int i = 0; i < postagens.size(); i++) {
            if (postagens.get(i).getId() == idRemoverPost) {
                postagens.remove(i);
                System.out.println("Post removido com sucesso.");
                removido = true;
                break;

            }
        }

        if (!removido) {
            System.out.println("Post com o ID informado não foi encontrado.");
        }
    }


    public static void lerPosts(List<Post> postagens){
        for (Post elements : postagens){
            System.out.println(elements.toString());
        }
    }
}
