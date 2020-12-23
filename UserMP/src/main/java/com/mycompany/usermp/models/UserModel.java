/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usermp.models;

import com.mycompany.usermp.entities.SysUsers;
import java.util.ArrayList;
import java.util.Collection;
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
public class UserModel {
    EntityManager em;
    Collection<Integer> availablIds;

    public UserModel() {
        em = Persistence.createEntityManagerFactory("myUserPU").createEntityManager();
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public Collection<Integer> getAvailablIds() {
        availablIds = new ArrayList<>();
        Collection<SysUsers> users = em.createQuery("SELECT u from SysUsers u").getResultList();
        for (SysUsers user : users) {
            availablIds.add(user.getUserid());
        }
        return availablIds;
    }

    public void setAvailablIds(Collection<Integer> availablIds) {
        this.availablIds = availablIds;
    }
}
