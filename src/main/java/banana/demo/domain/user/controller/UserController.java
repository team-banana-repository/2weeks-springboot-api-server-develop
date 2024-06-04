package banana.demo.domain.user.controller;

import banana.demo.domain.user.context.UserContext;
import banana.demo.domain.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserContext userContext;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userContext.saveUser(user);
    }

    @GetMapping("/{userName}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userContext.getUserById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}