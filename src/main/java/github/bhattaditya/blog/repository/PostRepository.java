package github.bhattaditya.blog.repository;

import github.bhattaditya.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
