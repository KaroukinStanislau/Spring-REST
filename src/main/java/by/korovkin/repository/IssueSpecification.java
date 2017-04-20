package by.korovkin.repository;

import by.korovkin.entity.Issue;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.util.StreamUtils;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/*
    private Long id;
    private String summary;
    private Priority priority;
    private String assignee;
    private Type type;
    private Status status;
    private Project project;
 */

public class IssueSpecification implements Specification<Issue> {

    private final Issue example;

    public IssueSpecification(Issue example) {
        this.example = example;
    }

    @Override
    public Predicate toPredicate(Root<Issue> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(example.getSummary())) {
            predicates.add(cb.like(root.<String>get("summary"), "%" + example.getSummary() + "%"));
        }

        if (!(example.getPriority() == null)){
            predicates.add(cb.equal(root.get("priority"), example.getPriority()));
        }

        if (!(example.getType() == null)){
            predicates.add(cb.equal(root.get("type"), example.getType()));
        }

        if (!(example.getStatus() == null)){
            predicates.add(cb.equal(root.get("status"), example.getStatus()));
        }

        return andTogether(predicates, cb);
    }

    private Predicate andTogether(List<Predicate> predicates, CriteriaBuilder cb) {
        return cb.and(predicates.toArray(new Predicate[0]));
    }
}
