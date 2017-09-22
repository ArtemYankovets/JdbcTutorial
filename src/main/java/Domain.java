import entity.Address;
import entity.EmplProj;
import entity.Employee;
import entity.Project;
import service.AddressService;
import service.EmplProjService;
import service.EmployeeService;
import service.ProjectService;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Domain {

    public static void main(String[] args) {
        AddressService addressService = new AddressService();
        EmployeeService employeeService = new EmployeeService();
        ProjectService projectService = new ProjectService();
        EmplProjService emplProjService = new EmplProjService();

        Address address = new Address();
        address.setId(1L);
        address.setCountry("DC");
        address.setCity("Gothan City");
        address.setStreet("Arkham street 1");
        address.setPostCode("12345");

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("James");
        employee.setLastName("Freeman");

        LocalDate birthday = LocalDate.of(1980, Month.JANUARY, 12);
        employee.setDate(Date.valueOf(birthday));

        employee.setAddressId(address.getId());

        Project project = new Project();
        project.setId(1L);
        project.setTitle("Gothan City Police Department Commissioner");

        EmplProj emplProj = new EmplProj();
        emplProj.setEmployeeId(employee.getId());
        emplProj.setProjectId(project.getId());

        try {
//            addressService.add(address);
//            employeeService.add(employee);
//            projectService.add(project);
//            emplProjService.add(emplProj);

            List<Address> addressList = addressService.getAll();
            for (Address a : addressList) {
                System.out.println(a);
            }

//            Address updatedAddress = address;
//            updatedAddress.setCity("NY");
//            addressService.update(updatedAddress);

            List<Employee> employeeList = employeeService.getAll();
            for (Employee e : employeeList) {
                System.out.println(e);
            }

            List<Project> projectList = projectService.getAll();
            for (Project p : projectList) {
                System.out.println(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
