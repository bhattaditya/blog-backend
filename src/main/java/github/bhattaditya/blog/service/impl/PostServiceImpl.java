package github.bhattaditya.blog.service.impl;

import github.bhattaditya.blog.payload.PostDto;
import github.bhattaditya.blog.repository.PostRepository;
import github.bhattaditya.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDto createPost(PostDto postDto) {
        return null;
    }

    @Override
    public List<PostDto> getPosts() {
        return null;
    }

    @Override
    public PostDto getPost(Long postId) {
        return null;
    }

    @Override
    public PostDto updatePost(Long postId, PostDto postDto) {
        return null;
    }

    @Override
    public void removePost(Long postId) {

    }
}
