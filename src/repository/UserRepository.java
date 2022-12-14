package repository;

import model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findUserName(String username);
    User save(User user);
}
