package github.bhattaditya.blog.service;

import github.bhattaditya.blog.payload.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto);
    void removeComment(Long commentId);
}
