package org.jblab.service;

import org.jblab.util.json.Token;
import org.jblab.util.json.VkUser;

/**
 * @author Aidar Shaifutdinov.
 */
public interface VkService {

    String getAuthUrl();

    Token getToken(String code);

    VkUser getUser(Token token);

}
