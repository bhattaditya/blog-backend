package github.bhattaditya.blog.service.impl;

import github.bhattaditya.blog.entity.User;
import github.bhattaditya.blog.payload.UserDto;
import github.bhattaditya.blog.repository.UserRepository;
import github.bhattaditya.blog.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.modelMapper.map(userDto, User.class);
        this.userRepository.save(user);

        return this.modelMapper.map(user, UserDto.class);
    }

    @Override
    public List<UserDto> getUsers() {
        return this.userRepository.
                findAll().
                stream().
                map(user -> this.modelMapper.map(user, UserDto.class)).
                collect(Collectors.toList());

    }

    @Override
    public UserDto getUser(Long userId) {
        User user = this.userRepository.
                findById(userId).
                orElseThrow(()-> new IllegalStateException("User with ID: " + userId + " not found"));

        return this.modelMapper.map(user, UserDto.class);
    }

    @Override
    public UserDto updateUser(Long userId, UserDto userDto) {
        User user = this.userRepository.
                findById(userId).
                orElseThrow(()-> new IllegalStateException("User with ID: " + userId + " not found"));

        user.setAbout(userDto.getAbout());
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());

        return this.modelMapper.map(user, UserDto.class);
    }

    @Override
    public void removeUser(Long userId) {
        User user = this.userRepository.
                findById(userId).
                orElseThrow(()-> new IllegalStateException("User with ID: " + userId + " not found"));

        this.userRepository.delete(user);
    }
}
