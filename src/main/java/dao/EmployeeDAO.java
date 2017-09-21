package dao;

import entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    // create
    void add(Employee Employee);

    // read
    List<Employee> getAll();

    Employee getById(Long id);

    // update
    void update(Employee Employee);

    // delete
    void remove(Employee Employee);

}
