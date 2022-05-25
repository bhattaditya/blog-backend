package github.bhattaditya.blog.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private String name;
    private String email;
    private String password;
    private String about;
}
