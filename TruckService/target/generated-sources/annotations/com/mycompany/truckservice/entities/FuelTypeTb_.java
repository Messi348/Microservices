package com.mycompany.truckservice.entities;

import com.mycompany.truckservice.entities.MyTruckTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-23T19:17:13")
@StaticMetamodel(FuelTypeTb.class)
public class FuelTypeTb_ { 

    public static volatile CollectionAttribute<FuelTypeTb, MyTruckTb> myTruckTbCollection;
    public static volatile SingularAttribute<FuelTypeTb, Double> currentPrice;
    public static volatile SingularAttribute<FuelTypeTb, Integer> id;
    public static volatile SingularAttribute<FuelTypeTb, String> type;

}