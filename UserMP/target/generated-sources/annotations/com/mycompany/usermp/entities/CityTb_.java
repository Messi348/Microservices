package com.mycompany.usermp.entities;

import com.mycompany.usermp.entities.StateTb;
import com.mycompany.usermp.entities.SysUsers;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-21T18:48:14")
@StaticMetamodel(CityTb.class)
public class CityTb_ { 

    public static volatile SingularAttribute<CityTb, String> cityName;
    public static volatile SingularAttribute<CityTb, StateTb> stateId;
    public static volatile SingularAttribute<CityTb, Integer> cityId;
    public static volatile CollectionAttribute<CityTb, SysUsers> sysUsersCollection;

}