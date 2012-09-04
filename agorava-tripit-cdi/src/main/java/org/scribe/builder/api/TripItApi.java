/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scribe.builder.api;

import org.scribe.model.OAuthConfig;
import org.scribe.utils.OAuthEncoder;

/**
 * Borrowd code from agorava-stackoverflow
 * 
 * API Detail : http://tripit.github.com/api/doc/v1/
 * 
 * 
 * @author hegdera
 */
public class TripItApi extends DefaultApi20  {
    private static final String AUTHORIZE_URL = "https://www.tripit.com/oauth/authorize?oauth_token=%s&oauth_callback=%s";
	//private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL+"&scope=%s";

	@Override
	public String getAccessTokenEndpoint() {
		return "https://api.tripit.com/oauth/request_token";
	}

	@Override
	public String getAuthorizationUrl(OAuthConfig config) {
//		Preconditions
//				.checkValidUrl(config.getCallback(),
//						"Must provide a valid url as callback. StackOverflow");

		// Append scope if present
		/*if (config.hasScope()) {
			return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(),
					OAuthEncoder.encode(config.getCallback()),
					OAuthEncoder.encode(config.getScope()));
		} else {
			return String.format(AUTHORIZE_URL, config.getApiKey(),
					OAuthEncoder.encode(config.getCallback()));
		} */
            
            return String.format(AUTHORIZE_URL, config.getApiKey(),
					OAuthEncoder.encode(config.getCallback()));
	}

}
