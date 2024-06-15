package rodrigo.salles.backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rodrigo.salles.backend_spring.entity.Department;

public interface DepartmentRepository extends JpaRepository <Department, Long>{
    
}
