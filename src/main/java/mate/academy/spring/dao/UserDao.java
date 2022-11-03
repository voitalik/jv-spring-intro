package mate.academy.spring.dao;

import mate.academy.spring.model.User;

import java.util.List;

public interface UserDao {
    User save(User user);
    List<User> getAll();
}
