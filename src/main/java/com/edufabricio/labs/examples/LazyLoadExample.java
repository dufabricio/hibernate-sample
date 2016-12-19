package com.edufabricio.labs.examples;

import com.edufabricio.labs.domain.Student;
import com.edufabricio.labs.domain.StudentAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Component
public class LazyLoadExample {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private DataSource ds;

    @Transactional
    public void lazyLoadTest(){

        Student student = new Student();
        student.setId(12L);
        student.setName("Chuck Norris");
        em.persist(student);

        StudentAddress address = new StudentAddress();
        address.setId(23L);
        address.setAddressLine1("Wall street, 212");
        address.setStudentId(student.getId());
        em.persist(address);




    }


}
