/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.tripit;

import javax.inject.Inject;
import org.agorava.core.api.oauth.OAuthService;
import org.agorava.core.cdi.AbstractSocialMediaApi;

/**
 *
 * @author hegdera
 */
public class TripItBaseService extends AbstractSocialMediaApi {
    
     public static String API_ROOT = "https://api.tripit.com/v1/";
    
    @Inject
    @TripIt
    private OAuthService service;

    @Override
    public String buildUri(String uri) {
        return API_ROOT + uri;
    }

    @Override
    public OAuthService getService() {
        return service;
    }
    
}
