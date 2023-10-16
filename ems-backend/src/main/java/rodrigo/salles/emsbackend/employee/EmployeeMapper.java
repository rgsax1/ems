package rodrigo.salles.emsbackend.employee;

public class EmployeeMapper {

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setEmail(employee.getEmail());
        employee.setFirstName(employee.getFirstName());
        employee.setLastName(employee.getLastName());
        return employee;

    }
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartment().getId()
        );
    }


}
