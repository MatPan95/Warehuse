package com.Januszex.Warehuse.JPA.Person;

import com.Januszex.Warehuse.JPA.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Person extends BaseEntity {

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50, nullable = false)
    private String lastName;

    @Column()
    private LocalDate dateOfBirth;

    @Column(length = 100)
    private String phoneNumber;

    @Column(length = 50)
    private String eMail;

    @Column(length = 20)
    private String login;

    @Column(length = 20)
    private String password;

}
