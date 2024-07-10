package com.Januszex.Warehuse.JPA.ClientAddres.Client;

import com.Januszex.Warehuse.JPA.ClientAddres.Addres.Addres;
import com.Januszex.Warehuse.JPA.Person.Person;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Client {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id")
    @MapsId
    private Person person;

    @ManyToMany
    @JoinTable(name = "client_addres",
            joinColumns = @JoinColumn(name = "addres_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "client_id", nullable = false))
    private List<Addres> addresList;

}
