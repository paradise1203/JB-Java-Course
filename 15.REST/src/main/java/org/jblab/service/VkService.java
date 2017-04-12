package org.jblab.service;

import org.jblab.util.VkUser;

/**
 * @author Aidar Shaifutdinov.
 */
public interface VkService {

    String getAuthUrl();

    VkUser getUser(String code);

}
