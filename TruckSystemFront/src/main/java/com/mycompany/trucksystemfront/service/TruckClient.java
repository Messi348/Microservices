/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trucksystemfront.service;

import java.util.Collection;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import token.GenerateToken;

/**
 *
 * @author messi
 */
@RegisterRestClient(configKey = "truckClient", baseUri = "http://localhost:8080/TruckService/rest")
@ApplicationScoped
@Path("/Truck")
public interface TruckClient {
    
    @GET
    @ClientHeaderParam(name = "authorization", value = "{generateJWTToken}")
    @Produces(MediaType.APPLICATION_JSON)
    List<Object[]> getAvailableMyTrucks();
    
    default String generateJWTToken() {
        System.out.println("here in generate token");
        Config config = ConfigProvider.getConfig();
        String token = "Bearer " + GenerateToken.generateJWT();
        System.out.println("Truck Token = " + token);
        return token;
    }
}
