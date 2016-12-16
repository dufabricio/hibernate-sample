package com.edufabricio.labs.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="STUDENT")
public class Student implements Serializable{

    @Id
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column(name = "STUDENT_NAME")
    private String name;

    @Id
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Set<StudentAddress> addresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StudentAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<StudentAddress> addresses) {
        this.addresses = addresses;
    }
}
