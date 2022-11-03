package mate.academy.spring.dao;

import mate.academy.spring.model.User;

import java.util.Optional;

public interface UserDao {
    User save(User user);
    Optional<User> get(Long id);
}
