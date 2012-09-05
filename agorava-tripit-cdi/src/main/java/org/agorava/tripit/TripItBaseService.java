/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.tripit;

import java.lang.annotation.Annotation;
import org.agorava.core.cdi.AbstractSocialNetworkService;

/**
 *
 * @author hegdera
 */
public class TripItBaseService extends AbstractSocialNetworkService {
    
     public static String API_ROOT = "https://api.tripit.com/v1/";
    
    @Override
    public Annotation getQualifier() {
        return TripItLiteral.INSTANCE;
    }

    @Override
    public String getApiRootUrl() {
        return API_ROOT;
    }
    
}
