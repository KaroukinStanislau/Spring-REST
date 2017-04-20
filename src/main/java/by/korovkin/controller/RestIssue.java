package by.korovkin.controller;

import by.korovkin.entity.*;
import by.korovkin.service.IssueService;
import by.korovkin.service.ReferenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestIssue {

    @Autowired
    IssueService issueService;

    @Autowired
    ReferenceService referenceService;

    private static final Logger log = LoggerFactory.getLogger("RestIssue");

    @RequestMapping(value = "/issue", method = RequestMethod.GET)
    public List<Issue> issueList() {
        log.info("fetching all issues");
        return issueService.findAll();
    }

    @RequestMapping(value = "/issue/{id}", method = RequestMethod.GET, produces =
            "application/json")
    public Issue fetchIssue(@PathVariable long id) {
        log.info("fetching issue: " + id);
        return issueService.findById(id);
    }

    @RequestMapping(value = "/issue", method = RequestMethod.POST, consumes = "application/json")
    public void postIssue(@RequestBody Issue issue) {
        log.info("post issue id: " + issue.getId());
        issueService.add(issue);
    }

    @RequestMapping(value = "/issue/{id}", method = RequestMethod.DELETE)
    public void deleteIssue(@PathVariable long id) {
        log.info("delete issue id: " + id);
        issueService.delete(id);
    }

    @RequestMapping(value = "/issue/priority", method = RequestMethod.GET, produces =
            "application/json")
    public List<Priority> priorityList() {
        log.info("fetching all priorities");
        return referenceService.findAllPriority();
    }

    @RequestMapping(value = "/issue/type", method = RequestMethod.GET, produces =
            "application/json")
    public List<Type> typeList(){
        log.info("fetching all types");
        return referenceService.findAllType();
    }

    @RequestMapping(value = "/issue/status", method = RequestMethod.GET, produces =
            "application/json")
    public List<Status> statusList() {
        log.info("fetching all statuses");
        return referenceService.findAllStatus();
    }

    @RequestMapping(value = "/issue/project", method = RequestMethod.GET, produces =
            "application/json")
    public List<Project> projectList() {
        log.info("fetching all projects");
        return referenceService.findAllProject();
    }

}
