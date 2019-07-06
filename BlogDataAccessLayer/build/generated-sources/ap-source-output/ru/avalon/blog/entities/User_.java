package ru.avalon.blog.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.avalon.blog.entities.Publication;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-06T17:35:14")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile ListAttribute<User, Publication> publications;

}