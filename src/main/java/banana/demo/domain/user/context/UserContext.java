package banana.demo.domain.user.context;

import banana.demo.domain.user.entity.User;
import banana.demo.domain.user.strategy.UserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class UserContext {

    private UserStrategy userStrategy;

    @Autowired
    public UserContext(UserStrategy userStrategy) {
        this.userStrategy = userStrategy;
    }

    public User saveUser(User user) {
        return userStrategy.saveUser(user);
    }

    public Optional<User> getUserById(Long id) {
        return userStrategy.getUserById(id);
    }
}