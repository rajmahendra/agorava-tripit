/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.tripit;

import java.lang.annotation.Annotation;
import java.util.logging.Logger;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import org.agorava.core.cdi.AbstractSocialMediaApiHub;

/**
 *
 * @author hegdera
 */
public class TripItServiceHub extends AbstractSocialMediaApiHub {

    private static final String MEDIA_NAME = "TripIt";

    @Inject
    Logger log;

    @Inject
    Instance<TripItBaseService> services;

  
    public Annotation getQualifier() {
        return TripItLiteral.INSTANCE;
    }


    @Override
    public String getSocialMediaName() {
        return MEDIA_NAME;
    }
}
