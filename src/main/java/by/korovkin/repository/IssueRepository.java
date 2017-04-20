package by.korovkin.repository;

import by.korovkin.entity.Issue;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long>, JpaSpecificationExecutor {

    List<Issue> findBySummaryContaining(String summary);

    Issue findById(long id);

    long count(Specification specification);
}
