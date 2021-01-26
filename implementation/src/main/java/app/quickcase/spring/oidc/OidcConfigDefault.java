package app.quickcase.spring.oidc;

public interface OidcConfigDefault {
    String NAMESPACE = "app.quickcase.claims/";

    interface Claims {
        // Standard claims
        String SUB = "sub";
        String NAME = "name";
        String EMAIL = "email";
        // Private claims
        String QC_ROLES = NAMESPACE + "roles";
        String QC_ORGANISATIONS = NAMESPACE + "organisations";
        String QC_USER_DEFAULT_JURISDICTION = NAMESPACE + "default_jurisdiction";
        String QC_USER_DEFAULT_CASE_TYPE = NAMESPACE + "default_case_type";
        String QC_USER_DEFAULT_STATE = NAMESPACE + "default_state";
    }
}
