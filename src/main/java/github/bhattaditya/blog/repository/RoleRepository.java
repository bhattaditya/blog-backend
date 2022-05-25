package github.bhattaditya.blog.repository;

import github.bhattaditya.blog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
