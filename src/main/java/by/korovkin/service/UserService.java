package by.korovkin.service;

import by.korovkin.entity.User;
import by.korovkin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User add(User user){
        return repository.save(user);
    }

    public List<User> findByUsernameContainingIgnoreCase(String username) {
        return repository.findByUsernameContainingIgnoreCase(username);
    }

    public List<String> findUsernames(String username) {
        return repository.findUsernames(username);
    }

    public User findByUsername(String username){
        return repository.findByUsername(username);
    }
}
