/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.truckservice.models;

import com.mycompany.truckservice.entities.MyTruckTb;
import java.util.Collection;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author messi
 */
@Named
@ApplicationScoped
public class TruckModel {
    EntityManager em;
    Collection<MyTruckTb> myTrucks;
    Collection<MyTruckTb> availableTrucks;

    public TruckModel() {
        em = Persistence.createEntityManagerFactory("myTruckPU").createEntityManager();
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<Object[]> getAvailableTrucks(Collection<Integer> ids) {
        String allids = convertIntCollectionToString(ids);
        return em.createNativeQuery("SELECT * FROM MY_TRUCK_TB m WHERE m.TRUCK_OWNER_ID IN (" + allids + ")").getResultList();
    }

    private String convertIntCollectionToString(Collection<Integer> ids) {
        String intString = "";
        for (Integer i : ids) {
            intString += i.toString() + ",";
        }
        return intString.substring(0, intString.length() - 1);
    }

    public void setAvailableTrucks(Collection<MyTruckTb> availableTrucks) {
        this.availableTrucks = availableTrucks;
    }

    public Collection<MyTruckTb> getMyTrucks() {

        return em.createNamedQuery("MyTruckTb.findAll") .getResultList();
    }

    public void setMyTrucks(Collection<MyTruckTb> myTrucks) {

        this.myTrucks = myTrucks;
    }
}
