package dao;

import entity.EmplProj;

import java.util.List;

public interface EmplProjDAO {

    // create
    void add(EmplProj EmplProj);

    // read
    List<EmplProj> getAll();

    EmplProj getByEmployeeIdAndProjectId(Long employeeId, Long projectId);

    // update
    void update(EmplProj EmplProj);

    // delete
    void remove(EmplProj EmplProj);

}
