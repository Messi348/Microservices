/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.truckservice.service;

import com.mycompany.truckservice.models.TruckModel;
import java.util.Collection;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 * REST Web Service
 *
 * @author messi
 */
@Path("Truck")
public class TruckResource {
    @Inject
    TruckModel truck;
    
    @Inject
    @RestClient
    UserClient userClient;
    
    @Inject
    JsonWebToken token;
    
    @GET
    @RolesAllowed("Admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object[]> getAvailableMyTrucks() {
        System.out.println("Recieved Raw Token in Product " + token.getRawToken());
        RawToken.setRtoken(token.getRawToken());
        Collection<Integer> allids = userClient.getAvailableUserIds();
        return truck.getAvailableTrucks(allids);
    }
}
