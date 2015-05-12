package com.automateddocsys.pma.pmaclientdata.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-05-10T00:25:20.635-0400")
@StaticMetamodel(Password.class)
public class Password_ {
	public static volatile SingularAttribute<Password, Integer> clientId;
	public static volatile SingularAttribute<Password, Integer> clientNo;
	public static volatile SingularAttribute<Password, String> username;
	public static volatile SingularAttribute<Password, String> password;
	public static volatile SingularAttribute<Password, String> name;
	public static volatile SingularAttribute<Password, Date> dateAdded;
	public static volatile SingularAttribute<Password, Clientname> clientName;
}
