package com.clone.service.posts.services;

import com.clone.service.posts.dtos.PostDTO;
import com.clone.service.posts.models.Post;
import com.clone.service.posts.repositories.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImp implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<PostDTO> findAll() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<PostDTO> findBySubCategoryId(Long subCategoryId) {
        List<Post> posts = postRepository.findBySubCategoryId(subCategoryId);
        return posts.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO findById(String id) {
        Post post = postRepository.findById(id)
                .orElseThrow(null);
        return convertToDTO(post);
    }

    @Override
    public PostDTO create(PostDTO postDTO) {
        Post post = convertToEntity(postDTO);
        Post savePost = postRepository.save(post);
        return convertToDTO(savePost);
    }

    @Override
    public PostDTO update(String id, PostDTO postDTO){
        Post post = postRepository.findById(id).orElseThrow(null);
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        Post updatePost = postRepository.save(post);
        return convertToDTO(updatePost);
    }

    @Override
    public void delete(String id) {postRepository.deleteById(id); }

    private PostDTO convertToDTO(Post post){
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setDescription(post.getDescription());
        postDTO.setSubCategoryId(post.getSubCategoryId());
        return postDTO;
    }

    private Post convertToEntity(PostDTO postDTO) {
        Post post = new Post();
        post.setId(postDTO.getId());
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setSubCategoryId(postDTO.getSubCategoryId());
        return post;
    }
}
