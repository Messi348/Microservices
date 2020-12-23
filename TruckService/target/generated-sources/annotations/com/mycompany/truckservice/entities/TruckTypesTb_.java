package com.mycompany.truckservice.entities;

import com.mycompany.truckservice.entities.MyTruckTb;
import com.mycompany.truckservice.entities.TruckModelTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-23T19:17:13")
@StaticMetamodel(TruckTypesTb.class)
public class TruckTypesTb_ { 

    public static volatile CollectionAttribute<TruckTypesTb, MyTruckTb> myTruckTbCollection;
    public static volatile SingularAttribute<TruckTypesTb, Integer> typeid;
    public static volatile CollectionAttribute<TruckTypesTb, TruckModelTb> truckModelTbCollection;
    public static volatile SingularAttribute<TruckTypesTb, String> typename;

}