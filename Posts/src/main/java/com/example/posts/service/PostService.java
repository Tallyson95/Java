package com.example.posts.service;

import com.example.posts.dto.PostResponseDTO;
import com.example.posts.model.Comentario;
import com.example.posts.model.Post;
import com.example.posts.repository.ComentarioRepository;
import com.example.posts.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final ComentarioRepository comentarioRepository;

    public PostService(PostRepository postRepository, ComentarioRepository comentarioRepository) {
        this.postRepository = postRepository;
        this.comentarioRepository = comentarioRepository;
    }

    public List<PostResponseDTO> listarPosts() {
        return postRepository.findAll().stream()
                .map(PostResponseDTO::fromEntity)
                .collect(Collectors.toList());
    }

    public PostResponseDTO buscarPost(Long id) {
        return postRepository.findById(id)
                .map(PostResponseDTO::fromEntity)
                .orElse(null);
    }

    public PostResponseDTO criarPost(Post post) {
        post.setMomento(new Date());
        post.setLikes(0);
        Post salvo = postRepository.save(post);
        return PostResponseDTO.fromEntity(salvo);
    }

    public boolean deletarPost(Long id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public PostResponseDTO comentarPost(Long postId, Comentario comentario) {
        Optional<Post> postOpt = postRepository.findById(postId);
        if (postOpt.isPresent()) {
            Post post = postOpt.get();
            comentario.setPost(post);
            comentario.setData(new Date());
            comentarioRepository.save(comentario);
            // Atualiza a lista de comentários do post
            post = postRepository.findById(postId).get();
            return PostResponseDTO.fromEntity(post);
        }
        return null;
    }
}