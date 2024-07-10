package com.Januszex.Warehuse.JPA.Employee;

import com.Januszex.Warehuse.JPA.Department.Department;
import com.Januszex.Warehuse.JPA.Person.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "employee_id")
    @MapsId
    private Person person;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Employee supervisor;

    @OneToMany(mappedBy = "supervisor")
    private List<Employee> subordinates;

    @OneToOne(mappedBy = "supervisor")
    private Department supervisorDepartment;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department employeeInDepartment;


    //Employee Constructor
    public Employee(Long id, Person person, Employee supervisor, Department employeeInDepartment){
        this.id = id;
        this.person = person;
        this.supervisor = supervisor;
        this.employeeInDepartment = employeeInDepartment;
    }

    //Spervisor Constructor
    public Employee(Long id, Person person, List<Employee> subordinates, Department supervisorDepartment){
        this.id = id;
        this.person = person;
        this.subordinates = subordinates;
        this.supervisorDepartment = supervisorDepartment;
    }
}
