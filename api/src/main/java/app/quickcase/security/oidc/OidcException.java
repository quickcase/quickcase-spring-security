package app.quickcase.security.oidc;

import org.springframework.security.core.AuthenticationException;

public class OidcException extends AuthenticationException {
    public OidcException(String msg, Throwable t) {
        super(msg, t);
    }

    public OidcException(String msg) {
        super(msg);
    }
}
