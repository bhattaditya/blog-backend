package github.bhattaditya.blog.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PostDto {

    private String title;
    private String content;
    private String image;
    private Date createdDate;
}
