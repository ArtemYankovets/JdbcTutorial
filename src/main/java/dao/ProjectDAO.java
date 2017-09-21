package dao;

import entity.Project;

import java.util.List;

public interface ProjectDAO {

    // create
    void add(Project Project);

    // read
    List<Project> getAll();

    Project getById(Long id);

    // update
    void update(Project Project);

    // delete
    void remove(Project Project);

}
