package github.bhattaditya.blog.service.impl;

import github.bhattaditya.blog.payload.CommentDto;
import github.bhattaditya.blog.repository.CommentRepository;
import github.bhattaditya.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public CommentDto createComment(CommentDto commentDto) {
        return null;
    }

    @Override
    public void removeComment(Long commentId) {

    }
}
