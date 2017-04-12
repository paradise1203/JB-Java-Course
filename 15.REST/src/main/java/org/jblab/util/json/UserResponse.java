package org.jblab.util.json;

import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
public class UserResponse {

    private List<VkUser> response;

    public List<VkUser> getResponse() {
        return response;
    }

    public void setResponse(List<VkUser> response) {
        this.response = response;
    }
}
