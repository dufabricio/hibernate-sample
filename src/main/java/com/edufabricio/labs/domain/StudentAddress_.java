package com.edufabricio.labs.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StudentAddress.class)
public abstract class StudentAddress_ {

	public static volatile SingularAttribute<StudentAddress, Long> studentId;
	public static volatile SingularAttribute<StudentAddress, Student> student;
	public static volatile SingularAttribute<StudentAddress, Long> studentId;
	public static volatile SingularAttribute<StudentAddress, String> addressLine1;
	public static volatile SingularAttribute<StudentAddress, Long> id;

}

