/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.truckservice.service;

import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author messi
 */
@RegisterRestClient(configKey = "userClient", baseUri = "http://localhost:8080/UserMP/rest")
@ApplicationScoped
@Path("/User")
public interface UserClient {
    @GET
    @ClientHeaderParam(name = "authorization", value = "{generateJWTToken}")
    @RolesAllowed("Admin")
    @Produces(MediaType.APPLICATION_JSON)
    Collection<Integer> getAvailableUserIds();
    
    default String generateJWTToken() {
        RawToken raw = new RawToken();
        Config config = ConfigProvider.getConfig();
        String token = "Bearer " + RawToken.getRtoken();
        System.out.println("Stock Token = " + token);
        return token;
    }
    
}
