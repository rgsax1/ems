package rodrigo.salles.backend_spring.mapper;

import rodrigo.salles.backend_spring.dto.DepartmentDto;
import rodrigo.salles.backend_spring.entity.Department;

public class DepartmentMapper {

    //convert jpa entity to dto
    public static DepartmentDto mapToDepartmentDto (Department department){
        return new DepartmentDto(
            department.getId(),
            department.getDepartmentName(),
            department.getDepartmentDescription()
        );
    }
    
    //convert department dto into department entit
    public static Department mapToDepartment (DepartmentDto departmentDto){
        return new Department(
            departmentDto.getId(),
            departmentDto.getDepartmentName(),
            departmentDto.getDepartmentDescription()
        );
    }
}
