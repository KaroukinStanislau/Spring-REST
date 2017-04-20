package by.korovkin.repository;

import by.korovkin.entity.Priority;
import by.korovkin.entity.Reference;
import by.korovkin.entity.Status;
import by.korovkin.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
