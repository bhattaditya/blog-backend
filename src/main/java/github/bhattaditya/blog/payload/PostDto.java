package github.bhattaditya.blog.payload;

import github.bhattaditya.blog.entity.Comment;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class PostDto {

    private Long id;
    private String title;
    private String content;
    private String image;
    private Date createdDate;
    private UserDto userDto;
    private CategoryDto categoryDto;
    private Set<Comment> comments = new HashSet<>();
}
