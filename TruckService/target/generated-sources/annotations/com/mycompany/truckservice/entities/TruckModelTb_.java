package com.mycompany.truckservice.entities;

import com.mycompany.truckservice.entities.MyTruckTb;
import com.mycompany.truckservice.entities.TruckTypesTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-23T19:17:13")
@StaticMetamodel(TruckModelTb.class)
public class TruckModelTb_ { 

    public static volatile CollectionAttribute<TruckModelTb, MyTruckTb> myTruckTbCollection;
    public static volatile SingularAttribute<TruckModelTb, Integer> truckWidth;
    public static volatile SingularAttribute<TruckModelTb, Integer> truckModelId;
    public static volatile SingularAttribute<TruckModelTb, Integer> truckCbm;
    public static volatile SingularAttribute<TruckModelTb, Integer> truckEnabled;
    public static volatile SingularAttribute<TruckModelTb, String> truckModelName;
    public static volatile SingularAttribute<TruckModelTb, Integer> truckWeight;
    public static volatile SingularAttribute<TruckModelTb, TruckTypesTb> truckTypeId;
    public static volatile SingularAttribute<TruckModelTb, Integer> truckLength;
    public static volatile SingularAttribute<TruckModelTb, Integer> truckHeight;
    public static volatile SingularAttribute<TruckModelTb, String> truckImg;
    public static volatile SingularAttribute<TruckModelTb, Integer> status;

}