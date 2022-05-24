package github.bhattaditya.blog.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_comment")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
}
