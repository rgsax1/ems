package rodrigo.salles.backend_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.salles.backend_spring.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
