package com.Januszex.Warehuse.JPA.Department;

import com.Januszex.Warehuse.JPA.Employee.Employee;
import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Department extends BaseEntity {

    @Column(length = 50, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "supervisor_id", nullable = false)
    private Employee supervisor;

    @OneToMany(mappedBy = "employeeInDepartment")
    private List<Employee> employeesInDepartment;
}
