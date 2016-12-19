package com.edufabricio.labs.domain;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SetAttribute<Student, StudentAddress> addresses;
	public static volatile SingularAttribute<Student, String> name;
	public static volatile SingularAttribute<Student, Long> id;

}

