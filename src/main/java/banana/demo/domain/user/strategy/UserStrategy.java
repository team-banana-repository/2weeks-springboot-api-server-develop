package banana.demo.domain.user.strategy;

import java.util.Optional;
import banana.demo.domain.user.entity.User;

public interface UserStrategy {
    User saveUser(User user);
    Optional<User> getUserById(Long id);
}
