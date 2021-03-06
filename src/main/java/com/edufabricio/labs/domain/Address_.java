package com.edufabricio.labs.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, String> country;
	public static volatile SingularAttribute<Address, Person> person;
	public static volatile SingularAttribute<Address, String> location;
	public static volatile SingularAttribute<Address, Long> id;

}

