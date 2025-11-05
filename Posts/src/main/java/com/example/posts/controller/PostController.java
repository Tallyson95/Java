package com.example.posts.controller;

import com.example.posts.dto.PostResponseDTO;
import com.example.posts.model.Comentario;
import com.example.posts.model.Post;
import com.example.posts.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostResponseDTO> listarPosts() {
        return postService.listarPosts();
    }

    @PostMapping
    public PostResponseDTO criarPost(@RequestBody Post post) {
        return postService.criarPost(post);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostResponseDTO> buscarPost(@PathVariable Long id) {
        PostResponseDTO dto = postService.buscarPost(id);
        if (dto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPost(@PathVariable Long id) {
        boolean removido = postService.deletarPost(id);
        if (removido)
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{id}/comentarios")
    public ResponseEntity<PostResponseDTO> comentarPost(@PathVariable Long id, @RequestBody Comentario comentario) {
        PostResponseDTO dto = postService.comentarPost(id, comentario);
        if (dto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }
}