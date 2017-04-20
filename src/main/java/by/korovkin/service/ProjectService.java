package by.korovkin.service;

import by.korovkin.entity.Project;
import by.korovkin.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public List<Project> findByNameContaining(String name) {
        return projectRepository.findByNameContainingIgnoreCase(name);
    }

    public Project findByName(String name) {
        return projectRepository.findByName(name);
    }
}
