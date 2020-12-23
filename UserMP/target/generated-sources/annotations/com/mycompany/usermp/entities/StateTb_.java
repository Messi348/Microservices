package com.mycompany.usermp.entities;

import com.mycompany.usermp.entities.CityTb;
import com.mycompany.usermp.entities.SysUsers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-21T18:48:14")
@StaticMetamodel(StateTb.class)
public class StateTb_ { 

    public static volatile CollectionAttribute<StateTb, CityTb> cityTbCollection;
    public static volatile SingularAttribute<StateTb, String> stateName;
    public static volatile SingularAttribute<StateTb, Integer> stateId;
    public static volatile CollectionAttribute<StateTb, SysUsers> sysUsersCollection;

}