package github.bhattaditya.blog.service;

import github.bhattaditya.blog.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getPosts();
    PostDto getPost(Long postId);
    PostDto updatePost(Long postId, PostDto postDto);
    void removePost(Long postId);
}
