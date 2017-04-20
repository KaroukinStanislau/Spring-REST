package by.korovkin.service;

import by.korovkin.constants.Constants;
import by.korovkin.entity.Issue;
import by.korovkin.repository.IssueRepository;
import by.korovkin.repository.IssueSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {


    @Autowired
    private IssueRepository issueRepository;

    public List<Issue> findAll() {
        return issueRepository.findAll();
    }

    public Page<Issue> findAll(Integer pageNumber) {
        PageRequest pageRequest = new PageRequest(pageNumber - 1, Constants.ITEMS_PER_PAGE);
        return issueRepository.findAll(pageRequest);
    }

    public Issue add(Issue issue) {
        return issueRepository.save(issue);
    }

    public List<Issue> findBySummary(String summary) {
        return issueRepository.findBySummaryContaining(summary);
    }

    public Issue findById(long id) {
        return issueRepository.findById(id);
    }

    public Page<Issue> filter(Issue issue, Integer pageNumber){
        PageRequest pageRequest = new PageRequest(pageNumber - 1, Constants.ITEMS_PER_PAGE);
        IssueSpecification specification = new IssueSpecification(issue);
        return issueRepository.findAll(specification, pageRequest);
    }

    public long filterCount(Issue issue) {
        IssueSpecification specification = new IssueSpecification(issue);
        return issueRepository.count(specification);
    }

    public void delete(long id) {
        issueRepository.delete(id);
    }
}
