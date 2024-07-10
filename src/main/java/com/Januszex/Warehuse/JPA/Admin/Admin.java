package com.Januszex.Warehuse.JPA.Admin;

import com.Januszex.Warehuse.JPA.Person.Person;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Admin {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "admin_id")
    @MapsId
    private Person person;
}
