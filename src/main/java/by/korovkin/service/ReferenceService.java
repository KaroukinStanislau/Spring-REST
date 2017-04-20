package by.korovkin.service;

import by.korovkin.entity.Priority;
import by.korovkin.entity.Project;
import by.korovkin.entity.Status;
import by.korovkin.entity.Type;
import by.korovkin.repository.PriorityRepository;
import by.korovkin.repository.ProjectRepository;
import by.korovkin.repository.StatusRepository;
import by.korovkin.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceService {

    @Autowired
    PriorityRepository priorityRepository;

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    StatusRepository statusRepository;

    @Autowired
    ProjectRepository projectRepository;

    public List<Priority> findAllPriority() {
        return priorityRepository.findAll();
    }

    public List<Type> findAllType() {
        return typeRepository.findAll();
    }

    public List<Status> findAllStatus() {
        return statusRepository.findAll();
    }

    public List<Project> findAllProject() {
        return projectRepository.findAll();
    }
}
