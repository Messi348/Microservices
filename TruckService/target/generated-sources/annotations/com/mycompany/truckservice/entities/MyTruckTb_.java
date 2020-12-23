package com.mycompany.truckservice.entities;

import com.mycompany.truckservice.entities.FuelTypeTb;
import com.mycompany.truckservice.entities.SysUsers;
import com.mycompany.truckservice.entities.TruckModelTb;
import com.mycompany.truckservice.entities.TruckTypesTb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-23T19:17:13")
@StaticMetamodel(MyTruckTb.class)
public class MyTruckTb_ { 

    public static volatile SingularAttribute<MyTruckTb, String> regNo;
    public static volatile SingularAttribute<MyTruckTb, Date> permitValidUpto;
    public static volatile SingularAttribute<MyTruckTb, String> ownerContactNo;
    public static volatile SingularAttribute<MyTruckTb, Date> regDate;
    public static volatile SingularAttribute<MyTruckTb, Integer> myTruckId;
    public static volatile SingularAttribute<MyTruckTb, String> chasisNo;
    public static volatile SingularAttribute<MyTruckTb, String> manufacturer;
    public static volatile SingularAttribute<MyTruckTb, String> fitnessCertificate;
    public static volatile SingularAttribute<MyTruckTb, String> tdsCertificate;
    public static volatile SingularAttribute<MyTruckTb, TruckModelTb> truckModelId;
    public static volatile SingularAttribute<MyTruckTb, String> ownerName;
    public static volatile SingularAttribute<MyTruckTb, String> regCertificate;
    public static volatile SingularAttribute<MyTruckTb, Integer> enable;
    public static volatile SingularAttribute<MyTruckTb, String> vehicleValue;
    public static volatile SingularAttribute<MyTruckTb, SysUsers> truckOwnerId;
    public static volatile SingularAttribute<MyTruckTb, String> roadPermitCertificate;
    public static volatile SingularAttribute<MyTruckTb, Date> taxValidUpto;
    public static volatile SingularAttribute<MyTruckTb, String> vehicleColor;
    public static volatile SingularAttribute<MyTruckTb, String> engineNo;
    public static volatile SingularAttribute<MyTruckTb, Date> insuranceValidUpto;
    public static volatile SingularAttribute<MyTruckTb, Date> fitnessValidUpto;
    public static volatile SingularAttribute<MyTruckTb, TruckTypesTb> truckTypeId;
    public static volatile SingularAttribute<MyTruckTb, String> insuranceCertificate;
    public static volatile SingularAttribute<MyTruckTb, String> emissionCertificate;
    public static volatile SingularAttribute<MyTruckTb, String> ownerAddress;
    public static volatile SingularAttribute<MyTruckTb, FuelTypeTb> fuelTypeId;
    public static volatile SingularAttribute<MyTruckTb, String> truckImg;
    public static volatile SingularAttribute<MyTruckTb, Integer> status;

}