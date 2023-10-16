package rodrigo.salles.emsbackend.department;


import jakarta.persistence.*;

@Entity
@Table (name = "department")
public class Department {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String departmentName;
    private String departmentDescription;

    public Department(long id, String departmentName, String departmentDescription) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
    }

    public Department() {
    }

    public long getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }
}
