package org.jblab.service.impl;

import org.apache.http.client.utils.URIBuilder;
import org.jblab.service.VkService;
import org.jblab.util.json.Token;
import org.jblab.util.json.UserResponse;
import org.jblab.util.VkOAuth;
import org.jblab.util.json.VkUser;
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
    public Token getToken(String code) {
        String url = vkOAuth.tokenUrl() + "&code=" + code;
        return restTemplate.getForObject(url, Token.class);
    }

    @Override
    public VkUser getUser(Token token) {
        URI userUrl = getURL(vkOAuth.userUrl(), token);
        return restTemplate.getForObject(userUrl, UserResponse.class).getResponse().get(0);
    }

    private URI getURL(String url, Token token) {
        try {
            return new URIBuilder(url)
                    .addParameter("v", vkOAuth.version())
                    .addParameter("access_token", token.getToken())
                    .build();
        } catch (URISyntaxException ignored) {
            return null;
        }
    }

}
