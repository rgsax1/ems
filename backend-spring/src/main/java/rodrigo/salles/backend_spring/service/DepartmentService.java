package rodrigo.salles.backend_spring.service;

import java.util.List;

import rodrigo.salles.backend_spring.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentById(Long departmentId);
    List<DepartmentDto> getAllDepartments();
    DepartmentDto updateDepartment(Long departmentId, DepartmentDto updatedDepartment);
    
}
