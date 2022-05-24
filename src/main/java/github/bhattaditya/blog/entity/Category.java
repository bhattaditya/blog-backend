package github.bhattaditya.blog.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
}
