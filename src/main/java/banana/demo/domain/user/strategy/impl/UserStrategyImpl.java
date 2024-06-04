package banana.demo.domain.user.strategy.impl;

import banana.demo.domain.user.entity.User;
import banana.demo.domain.user.repository.UserRepository;
import banana.demo.domain.user.strategy.UserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserStrategyImpl implements UserStrategy {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}