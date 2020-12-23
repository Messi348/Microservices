/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;

/**
 *
 * @author root
 */
@DatabaseIdentityStoreDefinition(
        dataSourceLookup = "jndi/project",
        callerQuery = "SELECT PASSWORD FROM SYS_USERS WHERE EMAIL=?",
        groupsQuery = "SELECT GROUP_NAME from SYS_USERS U,GROUP_MASTER G, USER_GROUP UG where UG.USER_ID = U.USERID and UG.GROUP_ID = G.GROUP_ID and U.EMAIL = ?",
        hashAlgorithm = Pbkdf2PasswordHash.class,
        priority = 30)
@ApplicationScoped
public class Project {

}
