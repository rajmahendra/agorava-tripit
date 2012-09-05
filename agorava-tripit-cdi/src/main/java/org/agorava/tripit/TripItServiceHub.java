/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.tripit;

import java.lang.annotation.Annotation;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import org.agorava.core.api.event.OAuthComplete;
import org.agorava.core.api.event.SocialEvent;
import org.agorava.core.cdi.AbstractSocialMediaApiHub;
import org.jboss.solder.logging.Logger;

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

    @Override
    public Annotation getQualifier() {
        return TripItLiteral.INSTANCE;
    }


    @Override
    public String getSocialMediaName() {
        return MEDIA_NAME;
    }
}
