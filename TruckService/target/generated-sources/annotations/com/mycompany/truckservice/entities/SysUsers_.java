package com.mycompany.truckservice.entities;

import com.mycompany.truckservice.entities.CityTb;
import com.mycompany.truckservice.entities.MyTruckTb;
import com.mycompany.truckservice.entities.StateTb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-23T19:17:13")
@StaticMetamodel(SysUsers.class)
public class SysUsers_ { 

    public static volatile CollectionAttribute<SysUsers, MyTruckTb> myTruckTbCollection;
    public static volatile SingularAttribute<SysUsers, String> address;
    public static volatile SingularAttribute<SysUsers, String> profile;
    public static volatile SingularAttribute<SysUsers, StateTb> stateId;
    public static volatile SingularAttribute<SysUsers, String> mobile;
    public static volatile SingularAttribute<SysUsers, CityTb> cityId;
    public static volatile SingularAttribute<SysUsers, Integer> userid;
    public static volatile SingularAttribute<SysUsers, Date> createdAt;
    public static volatile SingularAttribute<SysUsers, String> password;
    public static volatile SingularAttribute<SysUsers, String> fullname;
    public static volatile SingularAttribute<SysUsers, String> email;
    public static volatile SingularAttribute<SysUsers, String> username;
    public static volatile SingularAttribute<SysUsers, Integer> status;
    public static volatile SingularAttribute<SysUsers, Date> updatedAt;

}