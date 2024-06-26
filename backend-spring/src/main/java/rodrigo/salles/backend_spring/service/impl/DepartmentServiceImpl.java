package rodrigo.salles.backend_spring.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rodrigo.salles.backend_spring.dto.DepartmentDto;
import rodrigo.salles.backend_spring.entity.Department;
import rodrigo.salles.backend_spring.exception.ResourceNotFoundException;
import rodrigo.salles.backend_spring.mapper.DepartmentMapper;
import rodrigo.salles.backend_spring.repository.DepartmentRepository;
import rodrigo.salles.backend_spring.service.DepartmentService;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentById(Long departmentId) {
        Department department = departmentRepository.findById(departmentId).orElseThrow(
            () -> new ResourceNotFoundException("This department id: "+ departmentId +" does not exist"));
        return DepartmentMapper.mapToDepartmentDto(department);
    }

    @Override
    public List<DepartmentDto> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();
        return departments.stream().map(DepartmentMapper::mapToDepartmentDto)
        .collect(Collectors.toList());
    }

    @Override
    public DepartmentDto updateDepartment(Long departmentId, DepartmentDto updatedDepartment) {
        Department department = departmentRepository.findById(departmentId).orElseThrow(
            () -> new ResourceNotFoundException("Department with id "+departmentId+" does not exist.")
        );
        department.setDepartmentName(updatedDepartment.getDepartmentName());
        department.setDepartmentDescription(updatedDepartment.getDepartmentDescription());
        Department savedDepartment = departmentRepository.save(department);

        return DepartmentMapper.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.findById(departmentId).orElseThrow(
            () -> new ResourceNotFoundException("Department with id "+departmentId+" does not exist.")
        );

        departmentRepository.deleteById(departmentId);
    }

    

    

    
    
    
}
