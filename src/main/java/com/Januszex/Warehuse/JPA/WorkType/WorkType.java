package com.Januszex.Warehuse.JPA.WorkType;

import com.Januszex.Warehuse.JPA.Employee.Employee;
import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public class WorkType extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "starting_date")
    private LocalDateTime startingDate;

    @Column(name = "ending_date")
    private LocalDateTime endingDate;
}
