package com.edufabricio.labs.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="STUDENT_ADDRESS")
public class StudentAddress implements Serializable {

    @Id
    @Column(name = "STUDENT_ADDRESS_ID")
    private Long id;

    @Column(name = "STUDENT_ADDRESS_LINE1")
    private String addressLine1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID", insertable = false, updatable = false)
    private Student student;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
