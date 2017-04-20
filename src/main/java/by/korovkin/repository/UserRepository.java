package by.korovkin.repository;

import by.korovkin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    List<User> findByUsernameContainingIgnoreCase(String username);

    @Query("select u.username from User u where u.username like %?1%")
    List<String > findUsernames(String username);
}


