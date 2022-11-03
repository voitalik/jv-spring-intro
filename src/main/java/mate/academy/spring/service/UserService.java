package mate.academy.spring.service;

import mate.academy.spring.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> getAll();
}
