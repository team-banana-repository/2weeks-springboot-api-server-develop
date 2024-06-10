package banana.demo.domain.user.repository;

import banana.demo.domain.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(String id);
    List<User> findAll();
}