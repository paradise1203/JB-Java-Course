package org.jblab.service.impl;

import org.apache.http.client.utils.URIBuilder;
import org.jblab.service.VkService;
import org.jblab.util.VkOAuth;
import org.jblab.util.VkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Aidar Shaifutdinov.
 */
@Service
public class VkServiceImpl implements VkService {

    private final VkOAuth vkOAuth;
    private final RestTemplate restTemplate;

    @Autowired
    public VkServiceImpl(RestTemplate restTemplate, VkOAuth vkOAuth) {
        this.restTemplate = restTemplate;
        this.vkOAuth = vkOAuth;
    }

    @Override
    public String getAuthUrl() {
        return vkOAuth.authUrl();
    }

    @Override
    public VkUser getUser(String code) {
        return null;
    }

    private URI getURL(String url) {
        try {
            return new URIBuilder(url)
                    .addParameter("v", vkOAuth.version())
                    .build();
        } catch (URISyntaxException ignored) {
            return null;
        }
    }

}
