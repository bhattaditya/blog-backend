package github.bhattaditya.blog.service;

import github.bhattaditya.blog.entity.User;
import github.bhattaditya.blog.payload.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);
    List<UserDto> getUsers();
    UserDto getUser(Long userId);
    UserDto updateUser(Long userId, UserDto userDto);
    void removeUser(Long userId);
}
