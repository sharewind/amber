package org.apache.amber.oauth2.as.validator;

import javax.servlet.http.HttpServletRequest;

import org.apache.amber.oauth2.common.OAuth;
import org.apache.amber.oauth2.common.validators.AbstractValidator;

public class ThirdPartyCodeValidator extends AbstractValidator<HttpServletRequest> {

	public ThirdPartyCodeValidator(){
		requiredParams.add(OAuth.OAUTH_GRANT_TYPE);
		requiredParams.add(OAuth.OAUTH_CLIENT_ID);
		requiredParams.add(OAuth.OAUTH_THIRD_PARTY_PROVIDER);
		requiredParams.add(OAuth.OAUTH_CODE);
	}
}
